package studentOrientation.driver;

public interface Lecture extends Activity{
	
	public String id();
}

class CS240 implements Lecture {
	@Override
	public String id() {
		return "CS240";
	}

	@Override
	public double cost() {
		return 11.0;
	}

	@Override
	public int effort() {
		return 150;
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

class CS350 implements Lecture {
	@Override
	public String id() {
		return "CS350";
	}

	@Override
	public double cost() {
		return 10;
	}

	@Override
	public int effort() {
		return 50;
	}

	@Override
	public int cO2() {
		return 1;
	}

	@Override
	public int duration() {
		return 45;
	}
	
}
