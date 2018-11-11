package troubleShootSearch.engine;

import java.util.ArrayList;
import java.util.List;

import troubleShootSearch.driver.Driver;
import troubleShootSearch.products.*;

public class SemanticMatch implements Visitor{

	@Override
	public List<String> search(BackupPlus bp,String search) {
		return getSearchResults(bp.getPhrases(),search);
	}

	@Override
	public List<String> search(GameDrive gd,String search) {
		return getSearchResults(gd.getPhrases(),search);
	}

	@Override
	public List<String> search(HomeTheatre ht,String search) {
		return getSearchResults(ht.getPhrases(),search);
	}

	@Override
	public List<String> search(SurveillanceManager sm,String search) {
		return getSearchResults(sm.getPhrases(),search);
	}
	
	public List<String> getSearchResults(List<String> phrases, String searchTerm){
		List<String> result = new ArrayList<>();
		String[] words = searchTerm.split(" ");
		String key = words[words.length-1];
		String value = null;
		if(Driver.synonyms.containsKey(key)){
			value = Driver.synonyms.get(key);	
		}
		if(value!=null){
			for(String str:phrases){				
				if(str.contains(value)){
					result.add("Semantic Match : "+str);
				}
			}			
		}		
		return result;
	}

}
