package letter;

import city.Inhabitant;
import letter.content.Money;

public class PromissoryNote extends Letter<Money> {

	public PromissoryNote(Inhabitant sender, Inhabitant receiver, Money money) {
		super(sender, receiver, money);
		cost = SimpleLetter.COST + money.value() / 100;
	}

}
