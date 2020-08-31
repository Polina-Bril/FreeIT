package lesson7.task27;

import java.util.Date;

public class Visa extends CreditCard {

	private Date expireDate;

	public Visa() {
		super();
	}

	public Visa(Date expireDate) {
		super();
		this.expireDate = expireDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}
