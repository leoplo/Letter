package letter.special;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.Letter;
import letter.SimpleLetter;
import letter.content.Text;

public class UrgentLetterTest extends SpecialLetterTest {

	@Override
	public SpecialLetter createLetter() {
		return new UrgentLetter(sender, receiver, new SimpleLetter(sender, receiver, new Text("blabla")));
		}

	@Override
	@Test
	public void testCost() {
		Letter<Letter<?>> letter = createLetter();
		assertEquals(2,letter.cost());		
	}
	
	@Override
	@Test(expected = IllegalStateException.class)
	public void shouldNotHaveUrgentLetter() {
		new UrgentLetter(sender,receiver,new UrgentLetter(sender,receiver,createLetter()));
	}
}
