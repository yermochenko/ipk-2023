package by.vsu.domain;

public class Currency {
	private final long value;

	private Currency(long value) {
		this.value = value;
	}

	public Currency(long rub, int cop) {
		if(0 <= cop && cop < 100 && rub >= 0) {
			this.value = rub * 100 + cop;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public long getRub() {
		return value / 100;
	}

	public long getCop() {
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
		return getRub() + " руб. " + getCop() + " коп.";
	}
}
