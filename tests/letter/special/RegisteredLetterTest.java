package letter.special;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.Letter;
import letter.LetterTest;
import letter.SimpleLetter;
import letter.content.Text;

public class RegisteredLetterTest extends LetterTest<Letter<?>> {

	@Override
	public Letter<Letter<?>> createLetter() {
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

	@Override
	public void testReceiveAction() {
		// TODO Auto-generated method stub

	}
}
