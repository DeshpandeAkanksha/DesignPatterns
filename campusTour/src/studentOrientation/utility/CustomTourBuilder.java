package studentOrientation.utility;
import studentOrientation.driver.*;
public class CustomTourBuilder implements TourBuilder{
	
	private Tour tour;
	
	public CustomTourBuilder() {
		this.tour = new Tour();
	}

	@Override
	public void buildVisit(Visit v) {
		tour.setVisit(v);
	}

	@Override
	public void buildGiftShop(GiftShop g) {
		tour.setGiftshop(g);
	}

	@Override
	public void buildCafeteria(Cafeteria c) {
		tour.setCafeteria(c);
	}

	@Override
	public void buildLecture(Lecture l) {
		tour.setLearning(l);
	}
	
	public Tour getTour() {
		return this.tour;
	}

}
