package by.vsu.domain;

public class Currency {
	private final long value;

	private Currency(long value) {
		this.value = value;
	}

	public Currency(long rub, int kop) {
		if(0 <= kop && kop < 100 && rub >= 0) {
			this.value = rub * 100 + kop;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public long getRub() {
		return value / 100;
	}

	public long getKop() {
		return value % 100;
	}

	public Currency mul(int n) {
		return new Currency(value * n);
	}

	public Currency add(Currency currency) {
		return new Currency(value + currency.value);
	}

	@Override
	public String toString() {
		return getRub() + " руб. " + getKop() + " коп.";
	}
}
