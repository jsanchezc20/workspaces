package cat.daw.m3.nivell1;

public class Exercise4 {

	/** Exercici 4.1
	 * @param paramOne
	*/
	public String overrideMethod(String paramOne) {
		return paramOne;
	}

	/** Exercici 4.2
	 * @param paramOne
	 * @param paramTwo
	*/ 
	public void overrideMethod(String paramOne, int paramTwo) {
		System.out.println(paramOne + paramTwo);
	}

	/** Exercici 4.3
	 * @param paramOne
	 * @param paramTwo
	*/
	public String overrideMethod(String paramOne, boolean paramTwo) {
		return paramOne + paramTwo;
	}

}