package cat.daw.m3.nivell3;

public class App {

	public static void main(String[] args) {
		
		System.out.println("\n* * * Inici Nivell 3 * * *\n");

			SuperClass inheritClass = new InheritClass();

			inheritClass.methodOne("Crida a methodOne.");

			/*	He ficat la condició que si el paràmetre que 
				si passa (String) està buit llençi l'excepció */
			inheritClass.methodOne("");
			
			System.out.println("Sempre mostrarà el métode que s'hagi sobreescrit (Override).");

		System.out.println("\n* * * Fi Nivell 3 * * *\n");
			
	}
	
}
