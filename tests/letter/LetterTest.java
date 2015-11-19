package letter;

import static org.junit.Assert.*;
import letter.content.Content;

import org.junit.Test;

import city.City;
import city.MockInhabitant;

public abstract class LetterTest<C extends Content> {
	protected MockInhabitant sender = new MockInhabitant("Sender", new City("SendersCity"));
	protected MockInhabitant receiver = new MockInhabitant("Receiver", new City("ReceiversCity"));

	public abstract Letter<C> createLetter();

	public abstract void testCost();

	public abstract void testReceiveAction();

	@Test
	public void testSender() {
		Letter<C> letter = createLetter();
		assertEquals("Sender", letter.sender().name());
	}

	@Test
	public void testReceiver() {
		Letter<C> letter = createLetter();
		assertEquals("Receiver", letter.receiver().name());
	}
}
