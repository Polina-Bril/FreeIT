package lesson7.interfaces.task1.legs;

public class SamsungLeg implements ILeg {

	private int price;

	public SamsungLeg() {
		super();
	}

	public SamsungLeg(int price) {
		super();
		this.price = price;
	}

	@Override
	public void step() {
		System.out.println("Нога Samsung делает шаг");

	}

	@Override
	public int getPrice() {
		return price;
	}

}
