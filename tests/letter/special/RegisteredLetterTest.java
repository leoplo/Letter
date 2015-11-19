package letter.special;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.Letter;
import letter.SimpleLetter;
import letter.content.Text;

public class RegisteredLetterTest extends SpecialLetterTest {

	@Override
	public SpecialLetter createLetter() {
		return new RegisteredLetter(sender, receiver, new SimpleLetter(sender, receiver, new Text("blabla")));
	}

	@Test
	public void receiverSendsAcknowledgment() {
		assertEquals(0, this.receiver.numberOfLetterSent());
		createLetter().receiveAction();
		assertEquals(1, this.receiver.numberOfLetterSent());
	}

	@Override
	@Test
	public void testCost() {
		Letter<Letter<?>> letter = createLetter();
		assertEquals(16,letter.cost());
	}

	@Test
	public void testReceiveAction() {
		RegisteredLetter letter = (RegisteredLetter) createLetter();
		
		assertEquals(0,this.receiver.numberOfLetterSent());
		
		letter.receiveAction();
		
		assertEquals(1,this.receiver.numberOfLetterSent());

	}

	@Override
	@Test(expected = IllegalStateException.class)
	public void shouldNotHaveUrgentLetter() {
		new RegisteredLetter(sender,receiver,new UrgentLetter(sender,receiver,createLetter()));
	}
}
