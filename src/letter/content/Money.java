package letter.content;

public class Money implements Content {

	protected int amount;

	public Money() {
		this.amount = 0;
	}

	public Money(int amount) {
		if (amount < 0)
			throw (new IllegalArgumentException());
		this.amount = amount;
	}

	public int value() {
		return this.amount;
	}
}
