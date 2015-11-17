package letter.special;

import city.Inhabitant;
import letter.AcknowledgmentOfReceipt;
import letter.Letter;
import letter.content.Text;

public class RegisteredLetter extends SpecialLetter {

	public RegisteredLetter(Inhabitant sender, Inhabitant receiver, Letter<?> letter) {
		super(sender,receiver,letter);
	}
	
	@Override
	public int cost() {
		return this.content.cost() + 15;
	}

	@Override
	public void sendAction() {
		super.sendAction();
		// TODO : logger
	}
	
	@Override
	public void receiveAction() {
		AcknowledgmentOfReceipt acknowledgmentOfReceipt = new AcknowledgmentOfReceipt(this.receiver,this.sender,new Text("acknowledgment of receipt for a registered letter"));
		this.receiver.city().sendLetter(acknowledgmentOfReceipt);
		// TODO : logger
	}
}
