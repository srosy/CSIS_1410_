package enumDemo;

import java.util.Arrays;

public class TrafficLightApp {

	public static void main(String[] args) {
		TrafficLight green = TrafficLight.GREEN;
		System.out.println("green: " + green.toString());

		System.out.println("all trafficlights: " + Arrays.toString(TrafficLight.values()));

		for (TrafficLight el : TrafficLight.values()) {
			System.out.printf("%-6s .. %4.1s%n", el.toString(), el.getDuration()); // review of columns and spacing
		}

	}

}
