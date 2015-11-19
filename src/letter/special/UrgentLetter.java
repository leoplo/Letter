package letter.special;

import letter.Letter;
import letter.content.Content;
import city.Inhabitant;

/**
 * Any <code>Letter</code> can be changed into an <code>UrgentLetter</code> The
 * letter action steels the same but the cost is doubled
 */
public class UrgentLetter extends SpecialLetter {

	public UrgentLetter(Inhabitant sender, Inhabitant receiver,
			Letter<? extends Content> letter) {
		super(sender, receiver, letter);
	}

	@Override
	public int cost() {
		return 2 * this.content.cost();
	}

	@Override
	public String getDescription() {
		return "an urgent letter whose content is "
				+ this.content.getDescription();
	}
}
