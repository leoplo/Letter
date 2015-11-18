package letter;

import city.Inhabitant;
import letter.content.Text;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender, receiver, text);
	}

	@Override
	public String getDescription() {
		return " a thanks letter which is " + super.getDescription();
	}
}
