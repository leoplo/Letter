package letter;

import city.Inhabitant;
import letter.content.Money;
import letter.content.Text;
import logger.Logger;

/**
 * A <code>PromissoryNote</code> contains <code>Money</code> which will be send
 * to the receiver. Then the receiver send a thanks letter to the sender of the
 * <code>PromissoryNote</code>
 */
public class PromissoryNote extends Letter<Money> {

	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money money) {
		super(sender, receiver, money);
	}

	@Override
	public int cost() {
		return SimpleLetter.BASIC_COST + this.content.value() / 100;
	}

	@Override
	public void receiveAction() {
		Logger logger = Logger.getLogger();

		super.receiveAction();

		this.sender.pays(this.cost());

		logger.display("   - " + this.content.value()
				+ " euros are debited from " + this.sender.name()
				+ " acount whose balance is now "
				+ this.sender.bankAccount().amountRemain() + " euros \n");
		this.receiver.receiveMoney(this.content.value());
		logger.display("   + " + this.receiver.name()
				+ " account is credited with " + this.content.value()
				+ " euros; its balance is now "
				+ this.receiver.bankAccount().amountRemain() + " euros \n");

		ThanksLetter thanksLetter = new ThanksLetter(this.receiver,
				this.sender, new Text("thanks for " + this.getDescription()));
		this.receiver.city().sendLetter(thanksLetter);
	}

	@Override
	public String getDescription() {
		return "a promissory note letter whose content is a money content ("
				+ this.content.value() + ") ";
	}
}
