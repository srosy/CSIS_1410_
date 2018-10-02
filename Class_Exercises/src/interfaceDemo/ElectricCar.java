package interfaceDemo;

public class ElectricCar implements Electronic {
	private boolean running; // indicated if ignition is turned over
	private String model;

	public ElectricCar(String model) {
		this.model = model;
	}

	@Override
	public void togglePower() {
		running = !running;
	}

	public void drive() {
		if (running) {
			System.out.println("Fahrvergnuegen");
		} else {
			System.out.println("Bitte mache das Auto an.");
		}
	}

	@Override
	public String toString() {
		return model + (running ? " is running." : " is parked.");
	}

}
