package lesson7.interfaces.task2.shoes;

public class Sneakers implements Shoes {

	public Sneakers() {
		super();
	}

	@Override
	public void putOnShoes() {
		System.out.println("Put on the Sneakers");
	}

	@Override
	public void putOffShoes() {
		System.out.println("Put off the Sneakers");

	}

}