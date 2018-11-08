package studentOrientation.driver;

public interface Cafeteria extends Activity {
	public String name();
}

class CIW implements Cafeteria {

	@Override
	public String name() {
		return "CIW (waiting in long line).";
	}

	@Override
	public double cost() {
		return 10.0;
	}

	@Override
	public int effort() {
		return 100;
	}

	@Override
	public int cO2() {
		return 2;
	}

	@Override
	public int duration() {
		return 60;
	}
	
}

class MountainView implements Cafeteria {
	@Override
	public String name() {
		return "Mountain View. (Order online)";
	}

	@Override
	public double cost() {
		return 10.50;
	}

	@Override
	public int effort() {
		return 20;
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