package lesson7.task27;

public class Maestro extends CreditCard {

	private boolean isForeignUsePossible;

	public Maestro() {
		super();
	}

	public Maestro(boolean isForeignUsePossible) {
		super();
		this.isForeignUsePossible = isForeignUsePossible;
	}

	public boolean isForeignUsePossible() {
		return isForeignUsePossible;
	}

	public void setForeignUsePossible(boolean isForeignUsePossible) {
		this.isForeignUsePossible = isForeignUsePossible;
	}

}
