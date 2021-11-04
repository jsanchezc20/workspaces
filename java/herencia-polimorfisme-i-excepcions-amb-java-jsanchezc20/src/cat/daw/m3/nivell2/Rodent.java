package cat.daw.m3.nivell2;

public class Rodent {

	public void tail() {

	}

	public void incisors() {

	}

	public void quadruped() {

	}

}

class Mouse extends Rodent {

	@Override
	public void tail() {
		System.out.println("Cua llarga.");
	}

	@Override
	public void incisors() {
		System.out.println("Incisius grans.");
	}

	@Override
	public void quadruped() {
		System.out.println("Pates mitjanes.");
	}

}

class Jerbil extends Rodent {

	@Override
	public void tail() {
		System.out.println("Cua mitjana.");
	}

	@Override
	public void incisors() {
		System.out.println("Incisius molt petits.");
	}

	@Override
	public void quadruped() {
		System.out.println("Pates curtes.");
	}

}

class Hamster extends Rodent {

	@Override
	public void tail() {
		System.out.println("Sense cua.");
	}

	@Override
	public void incisors() {
		System.out.println("Incisius petits");
	}

	@Override
	public void quadruped() {
		System.out.println("Pates molt curtes");
	}


}