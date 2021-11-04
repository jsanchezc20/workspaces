package cat.daw.m3.nivell1;

public class Exercise4 {

	/** Exercici 4.1
	 * @param paramOne
	 * @throws Exception
	*/
	public String overrideMethod(String paramOne) throws Exception {
		return paramOne;
	}

	/** Exercici 4.2
	 * @param paramOne
	 * @param paramTwo
	 * @throws Exception
	*/ 
	public void overrideMethod(String paramOne, int paramTwo) throws Exception {
		System.out.println(paramOne + paramTwo);
	}

	/** Exercici 4.3
	 * @param paramOne
	 * @param paramTwo
	 * @throws Exception
	*/
	public String overrideMethod(String paramOne, boolean paramTwo) throws Exception {
		return paramOne + paramTwo;
	}

}