package letter;

import city.Inhabitant;
import letter.content.Money;

public class PromissoryNote extends Letter<Money> {

	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money money) {
		super(sender, receiver, money);
	}

	@Override
	public int cost() {
		return 1 + content.value() / 100;
	}

}
