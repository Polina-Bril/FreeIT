package lesson7.task27;

public class DebetCard extends BankCard{
	
	private int limitPerDay;

	public DebetCard() {
		super();
	}

	public DebetCard(int limitPerDay) {
		super();
		this.limitPerDay = limitPerDay;
	}

	public int getLimitPerDay() {
		return limitPerDay;
	}

	public void setLimitPerDay(int limitPerDay) {
		this.limitPerDay = limitPerDay;
	}
	
}
