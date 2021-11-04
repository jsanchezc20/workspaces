package cat.daw.m3.nivell3;

public class SuperClass {
	
	public void methodOne(String message) {
		try {

			methodTwo(message);	

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void methodTwo(String message) throws Exception {
		
		System.out.println("\nmethodTwo de SuperClass.\n");

	}

}

class InheritClass extends SuperClass {

	@Override
	public void methodTwo(String message) throws Exception {

		if ("".equals(message)) {
			throw new Exception("\nExcepció capturada.\n");
		}
		
		System.out.println("Overrided methodTwo de InheritClass.");
		
	}

}