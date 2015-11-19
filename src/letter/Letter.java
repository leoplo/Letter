package letter;

import city.Inhabitant;
import letter.content.Content;
import logger.Logger;

/**
 * A <code>Letter</code> contains a sender, a receiver and a content (anything)
 * Any <code>Letter</code> has an action which is execute when the <code>Letter</code> will be send
 * Each <code>Letter</code> has a cost
 */
public abstract class Letter<C extends Content> implements Content {

	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;

	public Letter(Inhabitant sender, Inhabitant receiver, C content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public Inhabitant sender() {
		return this.sender;
	}

	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}

	public Inhabitant receiver() {
		return this.receiver;
	}

	public abstract int cost();

	public abstract String getDescription();

	public void sendAction() {
		this.sender.pays(this.cost());
		Logger logger = Logger.getLogger();
		logger.display("-> " + this.sender.name() + " mails "
				+ this.getDescription() + " to " + this.receiver.name()
				+ " for a cost of " + this.cost() + " euros \n");
		logger.display("    - " + this.cost() + " euros are debited from "
				+ this.sender.name() + "account whose balance is now "
				+ this.sender.bankAccount().amountRemain() + " euros \n");
	}

	public void receiveAction() {
		Logger logger = Logger.getLogger();
		logger.display("<- " + this.receiver.name() + " receives "
				+ this.getDescription() + " from " + this.sender.name() + "\n");
	}
}