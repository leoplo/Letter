package letter.special;

import city.Inhabitant;
import letter.Letter;

public abstract class SpecialLetter extends Letter<Letter<?>> {
	
	public SpecialLetter(Inhabitant sender, Inhabitant receiver, Letter<?> letter) {
		super(sender,receiver,letter);
	}
	
}
