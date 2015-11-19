package letter;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.content.Text;

public class SimpleLetterTest extends LetterTest<Text> {

	public SimpleLetter createLetter() {
		return new SimpleLetter(sender, receiver, new Text("text"));
	}

	@Test
	public void testCost() {
		SimpleLetter letter = createLetter();
		assertEquals(SimpleLetter.BASIC_COST, letter.cost());
	}

	@Override
	public void testGetDescription() {
		SimpleLetter letter = createLetter();
		assertEquals(letter.getDescription(),
				"simple letter whose content is a text content (text)");
	}
}