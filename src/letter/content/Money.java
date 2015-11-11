package letter.content;

public class Money implements Content {

	protected int amount;
	
	public Money() {
		this.amount = 0;
	}
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
}
