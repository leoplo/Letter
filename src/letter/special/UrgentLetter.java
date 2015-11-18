package letter.special;

import letter.Letter;
import letter.content.Content;
import city.Inhabitant;

/**
 * Any <code>Letter</code> can be change into an <code>UrgentLetter</code>
 * The action letter is the same but the cost is doubled
 */
public class UrgentLetter extends SpecialLetter {

	public UrgentLetter(Inhabitant sender, Inhabitant receiver, Letter<? extends Content> letter) {
		super(sender, receiver, letter);
	}

	@Override
	public int cost() {
		return 2 * this.content.cost();
	}

	@Override
	public String getDescription() {
		return "an urgent letter whose content is " + this.content.getDescription();
	}

}
