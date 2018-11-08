package studentOrientation.driver;

public interface Visit extends Activity{
	public String commuteType();
}

class byBus implements Visit {
	@Override
	public String commuteType() {
		return "by bus.";
	}
	
	@Override
	public double cost() {
		return 1.0;
	}

	@Override
	public int effort() {
		return 50;
	}

	@Override
	public int cO2() {
		return 2;
	}

	@Override
	public int duration() {
		return 30;
	}
	
}

class onFoot implements Visit {
	@Override
	public String commuteType() {
		return "on foot.";
	}

	@Override
	public double cost() {
		return 0.50;
	}

	@Override
	public int effort() {
		return 200;
	}

	@Override
	public int cO2() {
		return 1;
	}

	@Override
	public int duration() {
		return 60;
	}
	
}