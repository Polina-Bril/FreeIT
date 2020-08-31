package lesson7.interfaces.task1.legs;

public class ToshibaLeg implements ILeg {

	private int price;

	public ToshibaLeg() {
		super();
	}

	public ToshibaLeg(int price) {
		super();
		this.price = price;
	}

	@Override
	public void step() {
		System.out.println("Нога Toshiba делает шаг");
	}

	@Override
	public int getPrice() {
		return price;
	}

}
