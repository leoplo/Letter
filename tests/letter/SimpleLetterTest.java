package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.content.Text;

public class SimpleLetterTest extends LetterTest<Text> {
	
	public SimpleLetter createLetter() {
		return new SimpleLetter(sender, receiver, new Text());
	}

	@Test
	public void testCost() {
		SimpleLetter letter = createLetter();
		assertEquals(letter.cost(), letter.BASIC_COST);
	}

	@Override
	public void testSendAction() {
		return;
	}

	@Override
	public void testReceiveAction() {
		return;
	}
}