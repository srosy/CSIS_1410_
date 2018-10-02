package interfaceDemo;

public class ElectronicApp {

	public static void main(String[] args) {
		Microwave mw = new Microwave();
		System.out.println(mw);
		mw.togglePower();
		System.out.println(mw);
		System.out.println();

		ElectricCar tesla = new ElectricCar("Model S");
		System.out.println(tesla);
		tesla.drive();
		tesla.togglePower();
		System.out.println(tesla);
		tesla.drive();
		tesla.togglePower();
		System.out.println(tesla);
		System.out.println();

		System.out.println("Demonstrating Polymorphism");
		Electronic[] electronics = { mw, tesla };
		for (Electronic e : electronics) {
			e.togglePower();
			System.out.println(e);
			if (e instanceof ElectricCar) {
				((ElectricCar) e).drive();
			}
		}

		for (Electronic e : electronics) {
			e.togglePower();
			System.out.println(e);
			if (e instanceof ElectricCar) {
				((ElectricCar) e).drive();
			}
			System.out.println();
		}
	}
}
