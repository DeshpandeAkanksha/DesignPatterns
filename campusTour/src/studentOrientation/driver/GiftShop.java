package studentOrientation.driver;

public interface GiftShop extends Activity {
	public String shopName();

}

class eventCenter implements GiftShop {
	@Override
	public String shopName() {
		return "Event Center.";
	}

	@Override
	public double cost() {
		return 5.0;
	}

	@Override
	public int effort() {
		return 100;
	}

	@Override
	public int cO2() {
		return 1;
	}

	@Override
	public int duration() {
		return 15;
	}
	
}

class UniversityUnion implements GiftShop {
	@Override
	public String shopName() {
		return "University Union.";
	}

	@Override
	public double cost() {
		return 5.0;
	}

	@Override
	public int effort() {
		return 100;
	}

	@Override
	public int cO2() {
		return 1;
	}

	@Override
	public int duration() {
		return 25;
	}
	
}
