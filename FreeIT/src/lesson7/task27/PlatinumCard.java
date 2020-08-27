package lesson7.task27;

public class PlatinumCard extends DebetCard {

	private int cashback;

	public PlatinumCard() {
		super();
	}

	public PlatinumCard(int cashback) {
		super();
		this.cashback = cashback;
	}

	public int getCashback() {
		return cashback;
	}

	public void setCashback(int cashback) {
		this.cashback = cashback;
	}

}
