package lesson7.task27;

public class BankCard {

	private String name;
	private int number;

	public BankCard() {
		super();

	}

	public BankCard(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
