package lesson7.interfaces.task1.hands;

public class SonyHand implements IHand {

	private int price;

	public SonyHand() {
		super();
	}

	public SonyHand(int price) {
		super();
		this.price = price;
	}

	@Override
	public void upHand() {
		System.out.println("Вверх поднята рука Sony");
	}

	@Override
	public int getPrice() {
		return price;
	}

}
