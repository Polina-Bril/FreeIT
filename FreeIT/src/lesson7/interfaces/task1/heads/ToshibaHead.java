package lesson7.interfaces.task1.heads;

public class ToshibaHead implements IHead {

	private int price;

	public ToshibaHead() {
		super();
	}

	public ToshibaHead(int price) {
		super();
		this.price = price;
	}

	@Override
	public void speek() {
		System.out.println("Говорит голова Toshiba");

	}

	@Override
	public int getPrice() {
		return price;
	}

}
