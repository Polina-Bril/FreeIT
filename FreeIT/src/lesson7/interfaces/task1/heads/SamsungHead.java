package lesson7.interfaces.task1.heads;

public class SamsungHead implements IHead {

	private int price;

	public SamsungHead() {
		super();
	}

	public SamsungHead(int price) {
		super();
		this.price = price;
	}

	@Override
	public void speek() {
		System.out.println("Говорит голова Samsung");

	}

	@Override
	public int getPrice() {
		return price;
	}

}
