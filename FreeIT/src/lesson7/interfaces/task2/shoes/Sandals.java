package lesson7.interfaces.task2.shoes;

public class Sandals implements Shoes {

	public Sandals() {
		super();
	}

	@Override
	public void putOnShoes() {
		System.out.println("Put on the Sandals");
	}

	@Override
	public void putOffShoes() {
		System.out.println("Put off the Sandals");

	}

}
