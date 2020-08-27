package lesson7.interfaces.task2.jackets;

public class Blazer implements Jacket {

	public Blazer() {
		super();
	}

	@Override
	public void putOnJacket() {
		System.out.println("Put on the Blazer");
	}

	@Override
	public void putOffJacket() {
		System.out.println("Put off the Blazer");

	}

}
