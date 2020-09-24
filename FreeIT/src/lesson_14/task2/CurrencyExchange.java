package lesson_14.task2;

public class CurrencyExchange {

	private int id;
	private volatile int quantityOfUSD;
	private volatile int quantityOfEUR;
	private static final int MAXIMALVALUE=5000;

	public CurrencyExchange(int id, int quantityOfUSD, int quantityOfEUR) {
		this.id = id;
		this.quantityOfUSD = quantityOfUSD;
		this.quantityOfEUR = quantityOfEUR;
	}

	public int getQuantityOfUSD() {
		return quantityOfUSD;
	}

	public int getQuantityOfEUR() {
		return quantityOfEUR;
	}

	public void setQuantityOfUSD(int quantityOfUSD) {
		this.quantityOfUSD = quantityOfUSD;
	}

	public void setQuantityOfEUR(int quantityOfEUR) {
		this.quantityOfEUR = quantityOfEUR;
	}

	public static int getMaximalvalue() {
		return MAXIMALVALUE;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", quantityOfUSD=" + quantityOfUSD + ", quantityOfEUR=" + quantityOfEUR
				+ "]";
	}

}
