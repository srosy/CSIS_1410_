package interfaceDemo;

public class Microwave implements Electronic {

	private boolean powerOn; // indicates whether the microwave is on

	@Override
	public void togglePower() {
		powerOn = !powerOn; // toggles between states
	}

	@Override
	public String toString() {
		return "Microwave [powerOn=" + powerOn + "]";
	}
}
