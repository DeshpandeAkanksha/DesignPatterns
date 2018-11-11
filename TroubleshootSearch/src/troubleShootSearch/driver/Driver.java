package troubleShootSearch.driver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import troubleShootSearch.engine.ExactMatch;
import troubleShootSearch.engine.NaiveMatch;
import troubleShootSearch.engine.SemanticMatch;
import troubleShootSearch.products.*;
import troubleShootSearch.util.Constants;
import troubleShootSearch.util.Util;

public class Driver {
	public static HashMap<String, String> synonyms = new HashMap<String, String>();
	
	public static void main(String[] args) throws IOException {
		synonyms = Util.loadSynonyms();
		BackupPlus bp = new BackupPlus();
		GameDrive gd = new GameDrive();
		HomeTheatre ht = new HomeTheatre();
		SurveillanceManager sm = new SurveillanceManager();
		BufferedWriter writer = new BufferedWriter(new FileWriter(Constants.output, true));
		
		List<String> inputList = Util.loadList(Constants.input);
		for(String input:inputList){
			String product = input.split(" ")[0];
			String searchString = input.substring(product.length()+1,input.length());
			List<String> result = new ArrayList<>();
			if(product.equals("BackupPlus")){
				result = search(bp, searchString);			
			}
			else if(product.equals("GameDrive")){
				result = search(gd, searchString);
			}
			else if(product.equals("HomeTheatre")){
				result = search(ht, searchString);
			}
			else if(product.equals("SurveillanceManager")){
				result = search(sm, searchString);
			}			
			if(result.size()==0 || result.isEmpty()){
				System.out.println("No result found for "+input);
			}
			else{
				try {
					
					writer.append("Input : "+input);
					writer.newLine();
					for(String str:result){
						writer.append(str);
						writer.newLine();
					}
					writer.append("===========================");
					writer.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			result.clear();
		}
		writer.close();
	}
	
	public static List<String> search (Visitable product, String searchString){
		Set<String> searchResultSet = new HashSet<>();
		List<String> resultList = new ArrayList<>();
		ExactMatch em = new ExactMatch();
		NaiveMatch nm = new NaiveMatch();
		SemanticMatch sm1 = new SemanticMatch();
		
		searchResultSet.addAll(product.accept(em,searchString));
		searchResultSet.addAll(product.accept(nm,searchString));
		searchResultSet.addAll(product.accept(sm1,searchString));
		
		resultList.addAll(searchResultSet);
		return resultList;
	}

}
