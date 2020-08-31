package lesson7.interfaces.task1.hands;

public class ToshibaHand implements IHand {

	private int price;

	public ToshibaHand() {
		super();
	}

	public ToshibaHand(int price) {
		super();
		this.price = price;
	}

	@Override
	public void upHand() {
		System.out.println("Вверх поднята рука Toshiba");
	}

	@Override
	public int getPrice() {
		return price;
	}

}
