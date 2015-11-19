package letter.special;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.Letter;
import letter.LetterTest;
import letter.SimpleLetter;
import letter.content.Text;

public class UrgentLetterTest extends LetterTest<Letter<?>> {

	@Override
	public Letter<Letter<?>> createLetter() {
		return new UrgentLetter(sender, receiver, new SimpleLetter(sender, receiver, new Text("blabla")));
		}

	@Override
	@Test
	public void testCost() {
		Letter<Letter<?>> letter = createLetter();
		assertEquals(2,letter.cost());		
	}

	@Override
	public void testReceiveAction() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void shouldBeTheDescriptionOfUrgentLetter() {
		Letter<Letter<?>> letter = createLetter();
		assertEquals("an urgent letter whose content is " + letter, letter.getDescription());
	}

}
