package city;

import static org.junit.Assert.*;
import org.junit.Test;

public class InhabitantTest {

	public class MockInhabitant extends Inhabitant {
		
		protected int numberOfLetterSent;
		
		public MockInhabitant() {
			this.name = "blabla";
			this.bankAccount = new BankAccount();
			this.city = new MockCity(); // TODO
			this.numberOfLetterSent = 0;
		}
		
	}
	
	@Test
	public void goodInhabitant() {
		City city = new City("Lille");
		Inhabitant inhabitant = new Inhabitant("John Doe", city);
		assertNotNull(inhabitant);
	}

	@Test
	public void shouldPaysLetter() {
		City city = new City("Lille");
		Inhabitant inhabitant = new Inhabitant("John Doe", city);

		assertEquals(5000, inhabitant.bankAccount().amountRemain());

		inhabitant.pays(5);

		assertEquals(4995, inhabitant.bankAccount().amountRemain());
	}

	@Test
	public void shouldReceiveMoney() {
		City city = new City("Lille");
		Inhabitant inhabitant = new Inhabitant("John Doe", city);

		assertEquals(5000, inhabitant.bankAccount().amountRemain());

		inhabitant.receiveMoney(5);

		assertEquals(5005, inhabitant.bankAccount().amountRemain());
	}
}
