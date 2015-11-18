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
	public void testCost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testSendAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void testReceiveAction() {
		// TODO Auto-generated method stub

	}
}
