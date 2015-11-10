package city;

public class Inhabitant {

	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, String nameCity){
		this.name = name;
		this.bankAccount = new BankAccount();
		this.city = new City(nameCity);
	}
	
	public City city() {
		// TODO Auto-generated method stub
		return null;
	}

	public void pays(int cost) {
		// TODO Auto-generated method stub
		
	}
	
}
