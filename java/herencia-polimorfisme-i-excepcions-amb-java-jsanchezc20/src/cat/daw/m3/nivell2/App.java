package cat.daw.m3.nivell2;

public class App {

	public static void main(String[] args) {

		System.out.println("\n* * * Inici Exercici 2.1 * * *\n");
			Unicycle unicycle = new Unicycle();
			Bicycle bicycle = new Bicycle();
			Tricycle tricycle = new Tricycle();

			Cycle[] cycles = {unicycle, bicycle, tricycle};

			for (Cycle cycle : cycles) {
				cycle.balance();
			}

		System.out.println("\n* * * Fi Exercici 2.1 * * *\n");

		System.out.println("\n* * * Inici Exercici 2.2 * * *\n");

			Mouse mouse = new Mouse();
			Jerbil jerbil = new Jerbil();
			Hamster hamster = new Hamster();

			Rodent[] rodents = {mouse, jerbil, hamster};

			for (Rodent rodent : rodents) {

				System.out.println(rodent.getClass().getSimpleName() + " té:");
				
				rodent.tail();
				rodent.incisors();
				rodent.quadruped();

				System.out.println();

			}

		System.out.println("\n* * * Fi Exercici 2.2 * * *\n");

	}

}