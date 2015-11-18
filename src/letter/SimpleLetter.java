package letter;

import city.Inhabitant;
import letter.content.Text;
import logger.Logger;

/**
 * A <code>SimpleLetter</code> contains <code>Text</code> The cost of this
 * letter is regular
 */
public class SimpleLetter extends Letter<Text> {

	protected final int BASIC_COST = 1;

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text content) {
		super(sender, receiver, content);
	}

	@Override
	public int cost() {
		return BASIC_COST;
	}

	public void sendAction() {
		super.sendAction();
		Logger logger = Logger.getLogger();
		logger.display("-> " + this.sender.name()
				+ " mails a simple letter whose content is a text content ("
				+ this.content.value() + ") to " + this.receiver.name()
				+ " for a cost of " + this.cost() + " euro \n");
		logger.display("   - " + this.cost() + " euros is debited from "
				+ this.sender.name() + " account whose balance is now "
				+ this.sender.bankAccount().amountRemain() + " euros \n");
	}

	public void receiveAction() {
		Logger logger = Logger.getLogger();
		logger.display("<- " + this.receiver.name()
				+ " receives a simple letter whose content is a text content ("
				+ this.content.value() + ") from " + this.sender.name() +"\n");
	}
}