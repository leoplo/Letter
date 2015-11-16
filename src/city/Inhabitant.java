package city;

/**
 * A <code>Inhabitant</code> belongs to a city and has a bankAccount
 */
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
	
	public String name() {
		return this.name;
	}

	public BankAccount bankAccount() {
		return this.bankAccount;
	}
	
	public void pays(int cost) {
		this.bankAccount.debit(cost);
	}
	
	public void receiveMoney(int cost) {
		this.bankAccount.credit(cost);
	}

}
