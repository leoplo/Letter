package letter;

import city.Inhabitant;

public abstract class LetterTest {

	public abstract void testCost();

	public void testAction() {
		Inhabitant sender = new Inhabitant("Bob", "Lille");
		Inhabitant receiver = new Inhabitant("Raymond", "Ronchin");
		Letter letter = new SimpleLetter(sender, receiver, ?);
		/* content must be implement */
	}
}
