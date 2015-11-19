package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.content.Money;

public class PromissoryNoteTest extends LetterTest<Money> {

	@Override
	public PromissoryNote createLetter() {
		return new PromissoryNote(sender, receiver, new Money(100));
	}

	@Test
	public void testCost() {
		PromissoryNote letter = createLetter();
		assertEquals(2, letter.cost());
		PromissoryNote letter2 = new PromissoryNote(sender, receiver, new Money(10));
		assertEquals(1, letter2.cost());
	}

	@Test
	public void testReceiveAction() {
		PromissoryNote letter = createLetter();

		assertEquals(5000, letter.sender().bankAccount().amountRemain());
		assertEquals(5000, letter.receiver().bankAccount().amountRemain());
		assertEquals(0, this.receiver.numberOfLetterSent());

		letter.receiveAction();

		assertEquals(4998, letter.sender().bankAccount().amountRemain());
		assertEquals(5099, letter.receiver().bankAccount().amountRemain());
		assertEquals(1, this.receiver.numberOfLetterSent());
	}

	@Test
	public void shouldBeTheDescriptionOfPromissoryNote() {
		PromissoryNote letter = createLetter();
		assertEquals("a promissory note letter whose content is a money content (" + letter.content.value() + ") ",
				letter.getDescription());
	}

}
