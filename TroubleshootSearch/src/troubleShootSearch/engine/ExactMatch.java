package troubleShootSearch.engine;

import java.util.ArrayList;
import java.util.List;
import troubleShootSearch.products.*;

public class ExactMatch implements Visitor{

	@Override
	public List<String> search(BackupPlus bp, String search) {
		return getSearchResults(bp.getPhrases(),search);
	}

	@Override
	public List<String> search(GameDrive gd, String search) {
		return getSearchResults(gd.getPhrases(),search);
	}

	@Override
	public List<String> search(HomeTheatre ht, String search) {
		return getSearchResults(ht.getPhrases(),search);
	}

	@Override
	public List<String> search(SurveillanceManager sm, String search) {
		return getSearchResults(sm.getPhrases(),search);
	}
	
	public List<String> getSearchResults(List<String> phrases, String searchTerm){
		List<String> result = new ArrayList<>();
		for(String str:phrases){
			if(str.contains(searchTerm)){
				result.add("Exact Match : "+str);
			}
		}
		return result;
	}

}
