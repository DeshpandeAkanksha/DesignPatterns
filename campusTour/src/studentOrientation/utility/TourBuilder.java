package studentOrientation.utility;
import studentOrientation.driver.*;

public interface TourBuilder {
	
	public void buildVisit(Visit v);
	
	public void buildGiftShop(GiftShop g);
	
	public void buildCafeteria(Cafeteria c);
	
	public void buildLecture(Lecture l);
	
	public Tour getTour();
}
