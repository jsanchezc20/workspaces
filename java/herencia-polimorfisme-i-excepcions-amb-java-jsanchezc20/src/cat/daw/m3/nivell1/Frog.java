package cat.daw.m3.nivell1;

public class Frog extends Amphibian implements Speakable{

	@Override
	public void breed() {
		System.out.println("La rana es reprodueix");
	}

	@Override
	public void feed() {
		System.out.println("La rana s'alimenta");
	}

	@Override
	public void rest() {
		System.out.println("La rana descansa");
	}

	@Override
	public void speak() {
		System.out.println("Frog, I am a Frog, What do I say? Ribbit, ribbit, I say it all day.\n");
	}

	/** Exercici 8
	 * @param jumps
	 */
	public void jump(int jumps) {
		try {
			if (jumps > 3) {
				throw new Exception("Error: Un gripau no pot saltar més de 3 vegades seguides ["+ jumps +" salts].\n");
			} else {
				System.out.println("El gripau a fet " + jumps + (jumps == 1 ? " salt" : " salts") + " !!!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}