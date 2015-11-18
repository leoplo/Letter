package letter.special;

import city.Inhabitant;
import letter.Letter;
import letter.content.Content;

/**
 * A <code>SpecialLetter</code> is a letter which contains an other letter except an urgent letter
 */
public abstract class SpecialLetter extends Letter<Letter<? extends Content>> {

	public SpecialLetter(Inhabitant sender, Inhabitant receiver, Letter<? extends Content> letter)
			throws IllegalStateException {
		super(sender, receiver, letter);
		if (letter instanceof UrgentLetter) {
			throw new IllegalStateException("Cannot put an urgent letter inside your letter");
		}
		letter.setReceiver(receiver);
		letter.setSender(sender);
	}
}
