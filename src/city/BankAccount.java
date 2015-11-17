package city;

public class BankAccount {
	protected int amount;

	public BankAccount() {
		this.amount = 5000;
	}

	public void credit(int amount) {
		this.amount += amount;
	}

	public void debit(int amount) {
		this.amount -= amount;
	}

	public int amountRemain() {
		return this.amount;
	}
}
