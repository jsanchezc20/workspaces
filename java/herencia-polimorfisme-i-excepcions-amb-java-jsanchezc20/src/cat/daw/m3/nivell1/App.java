package cat.daw.m3.nivell1;

public class App {

	// Exercici 1.1 Constructor
	public App() {
		System.out.println("Crida al constructor de la classe App.");
	}

	// Exercici 1.2 Mètode
	static void methodOne() {
		System.out.println("Crida al mètode de la classe App.\n");
	}

	public static void main(String[] args) {
		
		// Exercici 1
		System.out.println("\n* * * Inici Exercici 1 * * *\n");

			// 1.1 Crea instància
			App app = new App();
			// Perquè no sorti el warning que no s'esta fent servir
			app.toString();

			// 1.2 Invoca mètode des de main
			methodOne();

		System.out.println("* * * Fi Exercici 1 * * *\n");

		// Exercici 2
		System.out.println("* * * Inici Exercici 2 * * *\n");

			// 2.1 invoca el mètode static
			Exercise2.staticMethod();

			// 2.2 invoca el mètode no-static
			Exercise2 classExercise2 = new Exercise2();
			classExercise2.nonStaticMethod();

		System.out.println("* * * Fi Exercici 2 * * *\n");

		// Exercici 3
		System.out.println("* * * Inici Exercici 3 * * *\n");

			/*  3.1 Atribut static final (variable d'instància)
				Puc accedir al seu valor sense crear instància */
			System.out.println( "Exercise3.campStaticFinal -> "+ Exercise3.campStaticFinal + "\n" +
								"Accés directe, es por fer \n");
			/*  Però no modificar el seu valor perquè es final */
			System.out.println( "Exercise3.campStaticFinal = false\n" +
								"Donaria error, és final, no es pot canviar el seu valor.\n");
			/*  Ni creant instància */
			System.out.println( "Exercise3 classExercise3 = new Exercise3();\n" +
								"classExercise3.campStaticFinal = false\n" +
								"Donaria error, és final, no es pot canviar el seu valor.\n");

			/*  3.2 Atribut final (variable de classe)
				He de crear una instància per poder accedir a
				l'atribut, ja que, és una variable de classe */
			Exercise3 classExercise3 = new Exercise3();

			System.out.println( "Exercise3 classExercise3 = new Exercise3();\n" +
								"classExercise3.campFinal -> " + classExercise3.campFinal + "\n" +
								"Accés a varible mitjançant instància \n");
			/*  Però no modificar el seu valor perquè es final */
			System.out.println( "classExercise3.campFinal = false  \n" +
								"Donaria error, és final, no és pot canviar el valor.\n");

		System.out.println("* * * Fi Exercici 3 * * *\n");

		// Exercici 4
		System.out.println("* * * Inici Exercici 4 * * *\n");

			Exercise4inherits classOverride = new Exercise4inherits();

			System.out.println(
				classOverride.overrideMethod(
					"Override amb 1 parámetre String"
				)
			);

			classOverride.overrideMethod(
				"Override amb 2 parámetres, un String y un número sencer igual a ",
				3
			);
			
			System.out.println(
				classOverride.overrideMethod(
					"Override amb 2 parámetres, un String y boleà igual a ",
					true
				)
			);
			
			classOverride.overrideMethod(
				"Override amb 3 parámetres, un String, un un número sencer igual a ",
				3,
				true
			);

		System.out.println("* * * Fi Exercici 4 * * *\n");

		// Exercici 5 i 6
		System.out.println("* * * Inici Exercici 5 i 6 * * *\n");

			Frog frog = new Frog();
			
			frog.breed();
			frog.feed();
			frog.rest();

		System.out.println("* * * Fi Exercici 5 i 6 * * *\n");

		// Exercici 7
		System.out.println("* * * Inici Exercici 7 * * *\n");

			frog.speak();

		System.out.println("* * * Fi Exercici 7 * * *\n");

		// Exercici 8
		System.out.println("* * * Inici Exercici 8 * * *\n");

			for (int i = 1; i < 6; i++) {
				frog.jump(i);
			}

		System.out.println("* * * Fi Exercici 8 * * *\n");
	}

}