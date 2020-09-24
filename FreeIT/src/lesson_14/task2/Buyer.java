package lesson_14.task2;

import java.util.Queue;
import java.util.Random;

public class Buyer extends Thread {

	private final Queue<CurrencyExchange> currencyExchanges;

	public Buyer(Queue<CurrencyExchange> currencyExchanges) {
		this.currencyExchanges = currencyExchanges;
	}

	@Override
	public void run() {
		try {
			synchronized (currencyExchanges) {
				while (true) {
					if (!currencyExchanges.isEmpty()) {
						CurrencyExchange currencyExchange = currencyExchanges.remove();

						System.out.println(this.getName() + " обслуживается в обменнике " + currencyExchange);

						operationsWithCurrency(currencyExchange);
						System.out.println(this.getName() + " освобождает обменник " + currencyExchange);
						currencyExchanges.add(currencyExchange);
						currencyExchanges.notifyAll();
						break;
					} else {
						System.out.println(this.getName() + " ожидает свободный обменник");
						currencyExchanges.wait();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void operationsWithCurrency(CurrencyExchange currencyExchange) {
		Random rand = new Random();
		boolean exit = false;
		try {
			while (!exit) {
			String currency = "";
			int curr1 = 0;
			int curr2 = 0;
			int randAmountFirst = rand.nextInt(500);
			int randAmountSecond = rand.nextInt(500);
			int randCurrency = rand.nextInt(2);
			int randOperation = rand.nextInt(3);
				switch (randCurrency) {
				case 0:
					currency = "USD";
					curr1 = currencyExchange.getQuantityOfUSD();
					break;
				case 1:
					currency = "EUR";
					curr1 = currencyExchange.getQuantityOfEUR();
				}

				switch (randOperation) {
				case 0:
					if (curr1 - randAmountFirst < 0) {
						currencyExchanges.wait();
					} else {
						exit = true;
						System.out.println(this.getName() + " покупает " + currency + " на сумму " + randAmountFirst);
						curr1 -= randAmountFirst;
						if (randCurrency == 0)
							currencyExchange.setQuantityOfUSD(curr1);
						else
							currencyExchange.setQuantityOfEUR(curr1);

					}
					break;
				case 1:
					if (curr1 + randAmountFirst > CurrencyExchange.getMaximalvalue()) {
						currencyExchanges.wait();
					} else {
						exit = true;
						System.out.println(this.getName() + " продает " + currency + " на сумму " + randAmountFirst);
						curr1 += randAmountFirst;
						if (randCurrency == 0)
							currencyExchange.setQuantityOfUSD(curr1);
						else
							currencyExchange.setQuantityOfEUR(curr1);
					}

					break;
				case 2:
					
					if (currency == "USD") {
						curr2=currencyExchange.getQuantityOfEUR();
						if (curr1 + randAmountFirst > CurrencyExchange.getMaximalvalue()
								|| curr2 - randAmountSecond < 0) {
							currencyExchanges.wait();

						} else {
							exit = true;
							System.out.println(this.getName() + " продает " + currency + " на сумму " + randAmountFirst
									+ " и покупает EUR на сумму " + randAmountSecond);
							currencyExchange.setQuantityOfUSD(curr1 + randAmountFirst);
							currencyExchange.setQuantityOfEUR(curr2 - randAmountSecond);
						}
					} else {
						curr2=currencyExchange.getQuantityOfUSD();
						if (curr2 + randAmountSecond > CurrencyExchange.getMaximalvalue()
								|| curr1 - randAmountFirst < 0) {
							currencyExchanges.wait();

						} else {
							exit = true;
							System.out.println(this.getName() + " продает " + currency + " на сумму " + randAmountFirst
									+ " и покупает USD на сумму " + randAmountSecond);
							currencyExchange.setQuantityOfEUR(curr1 - randAmountFirst);
							currencyExchange.setQuantityOfUSD(curr2 + randAmountSecond);
						}
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}