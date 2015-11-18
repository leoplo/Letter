package letter.special;

import city.Inhabitant;
import letter.AcknowledgmentOfReceipt;
import letter.Letter;
import letter.content.Text;
import logger.Logger;

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
		Logger logger = Logger.getLogger();
		super.sendAction();
		logger.display("RegisteredLetter envoyé \n");
	}
	
	@Override
	public void receiveAction() {
		Logger logger = Logger.getLogger();
		AcknowledgmentOfReceipt acknowledgmentOfReceipt = new AcknowledgmentOfReceipt(this.receiver,this.sender,new Text("acknowledgment of receipt for a registered letter"));
		this.receiver.city().sendLetter(acknowledgmentOfReceipt);
		logger.display("RegisteredLetter reçu \n");
	}
}
