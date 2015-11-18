package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.content.Money;

public class PromissoryNoteTest extends LetterTest<Money> {

	@Override
	public PromissoryNote createLetter() {
		return new PromissoryNote(sender, receiver, new Money(10));
	}

	@Test
	public void testCost() {
		PromissoryNote letter = createLetter();
		assertEquals(letter.cost(), 1);
		PromissoryNote letter2 = new PromissoryNote(sender, receiver, new Money(100));
		assertEquals(letter2.cost(), 2);
	}

	@Override
	public void testSendAction() {
		return;
	}

	@Override
	public void testReceiveAction() {
		// TODO Auto-generated method stub
	}
}
