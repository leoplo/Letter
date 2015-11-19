package letter.special;

import city.Inhabitant;
import letter.Letter;
import letter.content.Content;

/**
<<<<<<< HEAD
 * A <code>SpecialLetter</code> is a letter which contains a <code>Letter</code>
 * of any kind except <code>UrgentLetter</code>
=======
 * A <code>SpecialLetter</code> is a letter which contains an other letter
 * except an urgent letter
>>>>>>> efd2b2b5363f9170dc061565dcff453c23346afb
 */
public abstract class SpecialLetter extends Letter<Letter<? extends Content>> {

	public SpecialLetter(Inhabitant sender, Inhabitant receiver,
			Letter<? extends Content> letter) throws IllegalStateException {
		super(sender, receiver, letter);
		if (letter instanceof UrgentLetter) {
			throw new IllegalStateException(
					"Cannot put an urgent letter inside your letter");
		}
		letter.setReceiver(receiver);
		letter.setSender(sender);
	}
}
