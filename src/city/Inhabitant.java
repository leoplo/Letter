package city;

public class Inhabitant {

	protected String name;
	protected City city;
	protected BankAccount bankAccount;

	public Inhabitant(String name, City city) {
		this.name = name;
		this.bankAccount = new BankAccount();
		this.city = city;
		this.city().addInhabitant(this);
	}

	public City city() {
		return this.city;
	}

	public BankAccount bankAccount() {
		return this.bankAccount;
	}
	
	public void pays(int cost) {
		this.bankAccount.debit(cost);
	}

}
