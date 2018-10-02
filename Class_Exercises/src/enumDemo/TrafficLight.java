package enumDemo;

public enum TrafficLight {
	GREEN(30), YELLOW(5), RED(17); // think of these like a constructor call, sets duration of each

	private double duration;

	private TrafficLight(double duration) {
		this.duration = duration;
	}

	public double getDuration() {
		return duration;
	}

	@Override
	// every override has a contract that must be followed. Here we break the
	// contract.
	public String toString() {
		return super.toString().toLowerCase(); // returns all and sets all lowercase
	}

}
