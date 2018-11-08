package studentOrientation.utility;

import studentOrientation.driver.*;

public class Student {
	
	private TourBuilder tourBuilder;
	
	public Student (TourBuilder tourBuilder) {
		this.tourBuilder = tourBuilder;
	}
	
	public Tour getTour () {
		return this.tourBuilder.getTour();
	}
	
	public void createTour(Visit v, GiftShop g, Cafeteria c, Lecture l) {
		this.tourBuilder.buildVisit(v);
		this.tourBuilder.buildGiftShop(g);
		this.tourBuilder.buildCafeteria(c);
		this.tourBuilder.buildLecture(l);
	}
	

}
