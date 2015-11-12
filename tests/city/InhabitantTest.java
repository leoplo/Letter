package city;

import static org.junit.Assert.*;
import org.junit.Test;

public class InhabitantTest {
	
	@Test
	public void testInhabitant(){
		City city = new City("Lille");
		Inhabitant inhabitant = new Inhabitant("John Doe",city);
		assertNotNull(inhabitant);
	}
	
	@Test
	public void testInhabitantCity(){
		City city = new City("Lille");
		Inhabitant inhabitant = new Inhabitant("John Doe",city);
		assertEquals(city,inhabitant.city());
	}

	@Test
	public void testPays(){
		City city = new City("Lille");
		Inhabitant inhabitant = new Inhabitant("John Doe",city);
		
		assertEquals(5000,inhabitant.bankAccount().amountRemain());
		
		inhabitant.pays(5);
		
		assertEquals(4995,inhabitant.bankAccount().amountRemain());
	}
	
}
