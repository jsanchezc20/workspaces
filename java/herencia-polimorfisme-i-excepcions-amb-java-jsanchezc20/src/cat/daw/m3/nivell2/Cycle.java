package cat.daw.m3.nivell2;

public class Cycle {
	int numberOfWheels;

	public void ride(int numberOfWheels) {
		System.out.println(wheels(numberOfWheels));
	}

	public int wheels(int numberOfWheels) {
		return numberOfWheels;
	}

	public void balance() {
		System.out.println("Balance de Cycle superClass.");
	}

}

class Unicycle extends Cycle {

	@Override
	public void balance() {
		System.out.println("Balance de UniCycle.");
	}

}

class Bicycle extends Cycle {

	@Override
	public void balance() {
		System.out.println("Balance de Biycle.");
	}

}

class Tricycle extends Cycle {

}