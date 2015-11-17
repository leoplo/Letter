package letter;

import static org.junit.Assert.*;
import letter.content.Content;

import org.junit.Test;

import city.City;
import city.Inhabitant;

public abstract class LetterTest<C extends Content> {
	protected Inhabitant sender = new Inhabitant("Sender", new City("SendersCity"));
	protected Inhabitant receiver = new Inhabitant("Receiver", new City("ReceiversCity"));

	public abstract Letter<C> createLetter();

	public abstract void testCost();

	public abstract void testSendAction();

	public abstract void testReceiveAction();

	@Test
	public void testSender() {
		Letter<C> letter = createLetter();
		assertEquals(letter.sender(), "Sender");
	}

	@Test
	public void testReceiver() {
		Letter<C> letter = createLetter();
		assertEquals(letter.receiver(), "Receiver");
	}
}
