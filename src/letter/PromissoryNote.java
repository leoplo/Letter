package letter;

import city.Inhabitant;
import letter.content.Money;
import logger.Logger;

public class PromissoryNote extends Letter<Money> {

	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money money) {
		super(sender, receiver, money);
	}

	@Override
	public int cost() {
		return 1 + this.content.value() / 100;
	}

	@Override
	public void sendAction() {
		super.sendAction();
		Logger logger = Logger.getLogger();
		logger.display("-> "
				+ this.sender.name()
				+ " mails a promissory note letter whose content is a money content ("
				+ this.content.value() + ") to " + this.receiver.name()
				+ " for a cost of " + this.cost() + " euros");
		logger.display("   - " + this.cost() + " euros is debited from "
				+ this.sender.name() + " account whose balance is now "
				+ this.sender.bankAccount().amountRemain() + " euros ");
	}

	@Override
	public void receiveAction() {
		Logger logger = Logger.getLogger();
		logger.display("<- "
				+ this.receiver.name()
				+ "receives a promissory note letter whose content is a money content ("
				+ this.content.value() + ") from " + this.sender.name() + "\n");
		this.sender.pays(this.content.value());
		logger.display("   - " + this.content.value()
				+ " euros are debited from " + this.sender.name()
				+ " acount whose balance is now "
				+ this.sender.bankAccount().amountRemain() + " euros");
		this.receiver.receiveMoney(this.content.value());
		logger.display("   + " + this.receiver.name()
				+ " account is credited with " + this.content.value()
				+ " euros; its balance is now "
				+ this.receiver.bankAccount().amountRemain() + " euros");
	}
}
