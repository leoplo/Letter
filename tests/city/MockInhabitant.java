package city;

public class MockInhabitant extends Inhabitant {

	protected int numberOfLetterSent;

	public MockInhabitant(String name, City city) {
		super(name, city);
		this.numberOfLetterSent = 0;
	}

	public int numberOfLetterSent() {
		return this.numberOfLetterSent;
	}

	@Override
	public void pays(int cost) {
		this.bankAccount.debit(cost);
		this.numberOfLetterSent++;
	}
}