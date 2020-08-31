package lesson7.interfaces.task2.jackets;

public class Coat implements Jacket {

	public Coat() {
		super();
	}

	@Override
	public void putOnJacket() {
		System.out.println("Put on the Coat");
	}

	@Override
	public void putOffJacket() {
		System.out.println("Put off the Coat");

	}

}
