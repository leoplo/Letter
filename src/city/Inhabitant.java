package city;

public class Inhabitant {

	protected String name;
	protected City city;
	protected BankAccount bankAccount;

	public Inhabitant(String name, String nameCity) {
		this.name = name;
		this.bankAccount = new BankAccount();
		this.city = new City(nameCity);
	}

	public City city() {
		return city;
	}

	public void pays(int cost) {
		bankAccount.debit(cost);
	}

}
