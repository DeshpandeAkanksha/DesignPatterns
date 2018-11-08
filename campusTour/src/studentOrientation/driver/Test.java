package studentOrientation.driver;

import studentOrientation.utility.CustomTourBuilder;
import studentOrientation.utility.Student;
import studentOrientation.utility.TourBuilder;


public class Test {
	
	public static void main(String args[]) {
		TourBuilder tb = new CustomTourBuilder();
		Student s1 = new Student(tb);
		Visit v = new byBus();
		GiftShop g = new UniversityUnion();
		Cafeteria c = new MountainView();
		Lecture l = new CS350();
		s1.createTour(v, g, c, l);
		System.out.println("First students tour details");
		System.out.println("---------------------------");
		s1.getTour().printTourDetails();
		
		Student s2 = new Student(tb);
		Visit v1 = new onFoot();
		GiftShop g1 = new eventCenter();
		Cafeteria c1 = new MountainView();
		Lecture l1 = new CS350();
		s2.createTour(v1, g1, c1, l1);
		System.out.println("Second students tour details");
		System.out.println("---------------------------");
		s2.getTour().printTourDetails();
	}

}
