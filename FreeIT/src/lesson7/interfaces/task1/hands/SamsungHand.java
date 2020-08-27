package lesson7.interfaces.task1.hands;

public class SamsungHand implements IHand {

	private int price;

	public SamsungHand() {
		super();
	}

	public SamsungHand(int price) {
		super();
		this.price = price;
	}

	@Override
	public void upHand() {
		System.out.println("Вверх поднята рука Samsung");
	}

	@Override
	public int getPrice() {
		return price;
	}

}
