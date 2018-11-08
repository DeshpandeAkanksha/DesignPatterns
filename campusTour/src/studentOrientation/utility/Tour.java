package studentOrientation.utility;

import studentOrientation.driver.*;

public class Tour implements TourPlan{
	
	private Visit visit;
	private GiftShop giftShop;
	private Cafeteria cafe;
	private Lecture lecture;

	@Override
	public void setVisit(Visit v) {
		this.visit = v;
	}
	
	@Override
	public void setGiftshop(GiftShop g) {
		this.giftShop = g;
	}

	@Override
	public void setCafeteria(Cafeteria c) {
		this.cafe = c;
	}

	@Override
	public void setLearning(Lecture l) {
		this.lecture = l;
	}
	
	public Visit getVisit() {
		return visit;
	}
	
	public GiftShop getGiftShop() {
		return giftShop;
	}
	
	public Cafeteria getCafeteria() {
		return cafe;
	}
	
	public Lecture getLearning() {
		return lecture;
	}
	
	public void printTourDetails() {
		double totalCost = visit.cost() + giftShop.cost() + cafe.cost() + lecture.cost();
		int totalDuration = visit.duration() + giftShop.duration() + cafe.duration() + lecture.duration();
		int totalEffort = visit.effort() + giftShop.effort() + cafe.effort() + lecture.effort();
		System.out.println("Student will visit buildings " + visit.commuteType());
		System.out.println("Cost: " + visit.cost() +" Effort: " + visit.effort() + " Duration: " + visit.duration());
		System.out.println("-----------------------------------------");
		System.out.println("Student will pick gifts from " + giftShop.shopName());
		System.out.println("Cost: " + giftShop.cost() +" Effort: " + giftShop.effort() + " Duration: " + giftShop.duration());
		System.out.println("-----------------------------------------");
		System.out.println("Student has decided to eat at " + cafe.name());
		System.out.println("Cost: " + cafe.cost() +" Effort: " + cafe.effort() + " Duration: " + cafe.duration());
		System.out.println("-----------------------------------------");
		System.out.println("Student will attend " + lecture.id());
		System.out.println("Cost: " + lecture.cost() +" Effort: " + lecture.effort() + " Duration: " + lecture.duration());
		System.out.println("-----------------------------------------");
		System.out.println("Total Cost : $" + totalCost);
		System.out.println("Total Effort : " + totalEffort + " Calories");
		System.out.println("Total Duration : " + totalDuration + " Minutes");
		System.out.println("=========================================");
		
	}

}
