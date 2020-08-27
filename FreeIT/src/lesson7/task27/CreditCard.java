package lesson7.task27;

public class CreditCard extends BankCard {

	private int percent;
	private int maxCreditAmount;

	public CreditCard() {
		super();
	}

	public CreditCard(int percent, int maxCreditAmount) {
		super();
		this.percent = percent;
		this.maxCreditAmount = maxCreditAmount;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int getMaxCreditAmount() {
		return maxCreditAmount;
	}

	public void setMaxCreditAmount(int maxCreditAmount) {
		this.maxCreditAmount = maxCreditAmount;
	}

}
