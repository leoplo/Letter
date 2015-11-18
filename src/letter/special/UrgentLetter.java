package letter.special;

import letter.Letter;
import letter.content.Content;
import city.Inhabitant;

public class UrgentLetter extends SpecialLetter{

	public UrgentLetter(Inhabitant sender, Inhabitant receiver,
			Letter<? extends Content> letter) {
		super(sender, receiver, letter);
	}

	@Override
	public int cost() {
		return 2 * this.content.cost();
	}

	@Override
	public void receiveAction() {
		// TODO Auto-generated method stub
		
	}

}
