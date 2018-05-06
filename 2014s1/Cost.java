
public class Cost {
	private int amount;
	private String currency;

	public Cost() {
		this.amount = 0;
		this.currency = "pounds sterling";
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int n) {
		if (n>=0) amount = n;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String s) {
		String[] cu = { "pounds sterling", "US dollars", "euros" };
		boolean b = false;
		for (int i = 0; i < 3; i++) {
			b = b || (s.equals(cu[i]));
		}
		if ((b) )  currency = s;
	}

	public void convert(String newCurrency, double rate) {
		String[] cu = { "pounds sterling", "US dollars", "euros" };
		boolean b = false;
		for (int i = 0; i < 3; i++) {
			b = b || (newCurrency.equals(cu[i]));
		}
		if ((b) && (rate >= 0)) {
			currency = newCurrency;
			amount = (int) (Math.round(amount / rate));
		}
	}

	public String toString() {
		return (String.format("%d %s", amount, currency));
	}

}
