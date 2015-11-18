package letter;

import city.Inhabitant;
import letter.content.Text;

public class AcknowledgmentOfReceipt extends SimpleLetter {

	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender, receiver, text);
	}

	@Override
	public String getDescription() {
		return "an aknowledgment of receipt which is " + super.getDescription();
	}
}
