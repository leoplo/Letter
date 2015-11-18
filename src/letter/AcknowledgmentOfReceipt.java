package letter;

import city.Inhabitant;
import letter.content.Text;
import logger.Logger;

public class AcknowledgmentOfReceipt extends SimpleLetter {

	public AcknowledgmentOfReceipt(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender,receiver,text);
	}
	
	@Override
	public void sendAction() {
		this.sender.pays(this.cost());		
		Logger logger = Logger.getLogger();
		logger.display("-> " + this.sender.name()
				+ " mails an aknowledgment of receipt which is a simple letter whose content is a text content ("
				+ this.content.value() + ") to " + this.receiver.name()
				+ " for a cost of " + this.cost() + " euro");
		logger.display("\n   - " + this.cost() + " euros is debited from "
				+ this.sender.name() + " account whose balance is now "
				+ this.sender.bankAccount().amountRemain() + " euros "); 
	}
	
	public void receiveAction() {
		Logger logger = Logger.getLogger();
		logger.display("<- " + this.receiver.name()
				+ " receives a simple letter whose content is a text content ("
				+ this.content.value() + ") from " + this.sender.name());
	}
}
