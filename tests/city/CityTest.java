package city;

import static org.junit.Assert.*;
import letter.SimpleLetter;
import letter.content.Text;

import org.junit.Test;

public class CityTest {

	@Test
	public void goodCity() {
		City city = new City("Lille");
		assertNotNull(city);
		assertEquals("Lille", city.name);
		assertTrue(city.postbox.isEmpty());
		assertTrue(city.inhabitants.isEmpty());
	}

	@Test
	public void shouldSendLetter() {
		City city = new City("Lille");
		Inhabitant sender = new Inhabitant("sender", city);
		Inhabitant receiver = new Inhabitant("receiver", city);

		assertTrue(city.inhabitants.contains(sender));
		assertTrue(city.inhabitants.contains(receiver));
		assertEquals(2, city.inhabitants.size());

		SimpleLetter letter = new SimpleLetter(sender, receiver, new Text());
		city.sendLetter(letter);

		assertFalse(city.postbox.isEmpty());
		assertEquals(1, city.postbox.size());
	}

	@Test
	public void shouldDistributeLetter() {
		City city = new City("Lille");
		Inhabitant sender = new Inhabitant("sender", city);
		Inhabitant receiver = new Inhabitant("receiver", city);
		SimpleLetter letter = new SimpleLetter(sender, receiver, new Text());
		assertTrue(city.postbox.isEmpty());
		city.sendLetter(letter);
		assertFalse(city.postbox.isEmpty());
		city.distributeLetter();
		assertTrue(city.postbox.isEmpty());
	}

}
