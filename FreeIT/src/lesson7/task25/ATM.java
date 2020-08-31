package lesson7.task25;

public class ATM {

	private int quantityOf20;
	private int quantityOf50;
	private int quantityOf100;

	public ATM(int quantityOf100, int quantityOf50, int quantityOf20) {
		super();
		this.quantityOf20 = quantityOf20;
		this.quantityOf50 = quantityOf50;
		this.quantityOf100 = quantityOf100;
	}

	public void addXXs(int quantity, int nominal) {
		if (nominal == 20) {
			this.quantityOf20 += quantity;
		} else if (nominal == 50) {
			this.quantityOf50 += quantity;
		} else if (nominal == 100) {
			this.quantityOf100 += quantity;
		} else {
			System.out.println("Nominal vveden ne verno. Vernye varianty: 20 ili 50 ili 100");
		}
	}

	public boolean withdrawMoney(int money) {
		int moneyAvailable = quantityOf20 * 20 + quantityOf50 * 50 + quantityOf100 * 100;
		int temp100 = this.quantityOf100;
		int temp50 = this.quantityOf50;
		int temp20 = this.quantityOf20;
		int n = 0;
		int m = 0;
		int l = 0;
		if (((money >= 50 && money % 10 == 0) || (money < 50 && money % 20 == 0)) && moneyAvailable >= money) {
			n = money / 100;
			if (this.quantityOf100 >= n) {
				this.quantityOf100 -= n;
				m = 0;
				l = 0;
			} else if (this.quantityOf50 / 2 + this.quantityOf100 >= n) {
				m = (n - this.quantityOf100) * 2;
				this.quantityOf50 -= m;
				n = this.quantityOf100;
				this.quantityOf100 = 0;
				l = 0;
			} else if (this.quantityOf20 / 5 + this.quantityOf50 / 2 + this.quantityOf100 >= n) {
				l = (n - (this.quantityOf100 + this.quantityOf50 / 2)) * 5;
				this.quantityOf20 -= l;

				m = this.quantityOf50 / 2 * 2;
				this.quantityOf50 -= m;

				n = this.quantityOf100;
				this.quantityOf100 = 0;

			} else {
				this.quantityOf100 = temp100;
				this.quantityOf50 = temp50;
				this.quantityOf20 = temp20;
				System.out.println(
						"V bankomate nedostatochno kakih-to nominalov. Poprobuite umen'shit' vvedennuyu summu na 50");
				return false;
			}
			int k = money % 100;
			if (k % 20 == 0) {
				if (this.quantityOf20 >= k / 20) {
					l += k / 20;
					this.quantityOf20 -= k / 20;
				} else {
					this.quantityOf100 = temp100;
					this.quantityOf50 = temp50;
					this.quantityOf20 = temp20;
					System.out.println(
							"V bankomate nedostatochno kupyur nominalom 20. Poprobuite okruglit zhelaemuyu summu do 50 ili 100");
					return false;
				}
			} else if (this.quantityOf50 > 0) {
				m += 1;
				this.quantityOf50 -= 1;
				int l1 = (k - 50) / 20;
				if (l1 < 0) {
					n -= 1;
					this.quantityOf100 += 1;
					l += (k + 50) / 20;
					this.quantityOf20 -= (k + 50) / 20;
				} else {
					l += l1;
					this.quantityOf20 -= (k - 50) / 20;
				}
			} else {
				this.quantityOf100 = temp100;
				this.quantityOf50 = temp50;
				this.quantityOf20 = temp20;
				System.out.println(
						"V bankomate nedostatochno kupyur nominalom 50. Poprobuite okruglit zhelaemuyu summu do 100");
				return false;
			}
			System.out.println("Vydano " + n + " kupyur nominalom 100, " + m + " kupyur nominalom 50, " + l
					+ " kupyur nominalom 20");
			return true;
		} else {
			System.out.println(
					"V bankomate nedostatochno deneg. Ili vy vveli nevernyu summu. Dostupnye nominaly - 20, 50 i 100");
			return false;
		}
	}

	public int getQuantityOf20() {
		return quantityOf20;
	}

	public int getQuantityOf50() {
		return quantityOf50;
	}

	public int getQuantityOf100() {
		return quantityOf100;
	}

}
