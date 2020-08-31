package lesson7.interfaces.task2.pants;

public class Tights implements Pants {

	public Tights() {
		super();
	}

	@Override
	public void putOnPants() {
		System.out.println("Put on the Tights");
	}

	@Override
	public void putOffPants() {
		System.out.println("Put off the Tights");

	}

}
