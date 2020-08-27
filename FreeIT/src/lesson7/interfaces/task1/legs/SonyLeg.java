package lesson7.interfaces.task1.legs;

public class SonyLeg implements ILeg {

	private int price;

	public SonyLeg() {
		super();
	}

	public SonyLeg(int price) {
		super();
		this.price = price;
	}

	@Override
	public void step() {
		System.out.println("Нога Sony делает шаг");
	}

	@Override
	public int getPrice() {
		return price;
	}

}
