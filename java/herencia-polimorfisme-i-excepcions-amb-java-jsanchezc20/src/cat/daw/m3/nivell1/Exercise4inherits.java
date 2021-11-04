package cat.daw.m3.nivell1;

// Exercici 4.4
public class Exercise4inherits extends Exercise4 {

	/** Exercici 4.5
	 * @param paramOne
	 * @param paramTwo
	 * @param paramThree
	 * @throws Exception
	*/
	public void overrideMethod(String paramOne, int paramTwo, boolean paramThree) throws Exception {
		System.out.println(
			paramOne + 
			paramTwo + 
			" i un boleà igual a " +
			paramThree + "\n"
		);
	}

}