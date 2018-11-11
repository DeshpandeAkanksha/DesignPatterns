package troubleShootSearch.engine;

import java.util.List;

import troubleShootSearch.products.*;

public interface Visitor {
	
	public List<String> search(BackupPlus bp, String search);
	
	public List<String> search(GameDrive gd, String search);
	
	public List<String> search(HomeTheatre ht, String search);
	
	public List<String> search(SurveillanceManager sm, String search);
	

}
