package troubleShootSearch.engine;

import java.util.ArrayList;
import java.util.List;
import troubleShootSearch.products.*;

public class NaiveMatch implements Visitor{

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
		//System.out.println(words[0]);
		for(String str:phrases){
			if(str.contains(words[0])){
				result.add("Naive Match : "+str);
			}
		}
		return result;
	}

}
