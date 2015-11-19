package letter.special;

import city.Inhabitant;
import letter.AcknowledgmentOfReceipt;
import letter.Letter;
import letter.content.Text;

/**
 * When an <code>Inhabitant</code> receives a <code>RegisteredLetter</code>, an
 * acknowledgement of receipt is sent to the sender
 */
public class RegisteredLetter extends SpecialLetter {

	public RegisteredLetter(Inhabitant sender, Inhabitant receiver,
			Letter<?> letter) {
		super(sender, receiver, letter);
	}

	@Override
	public int cost() {
		return this.content.cost() + 15;
	}

	@Override
	public void receiveAction() {
		AcknowledgmentOfReceipt acknowledgmentOfReceipt = new AcknowledgmentOfReceipt(
				this.receiver, this.sender, new Text(
						"acknowledgment of receipt for "
								+ this.getDescription()));
		this.receiver.city().sendLetter(acknowledgmentOfReceipt);
	}

	@Override
	public String getDescription() {
		return "a registered letter whose content is "
				+ this.content.getDescription();
	}
}
