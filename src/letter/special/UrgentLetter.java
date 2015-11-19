package letter.special;

import letter.Letter;
import letter.content.Content;
import city.Inhabitant;

/**
<<<<<<< HEAD
 * Any <code>Letter</code> can be changed into an <code>UrgentLetter</code> The
 * letter action steels the same but the cost is doubled
=======
 * Any <code>Letter</code> can be change into an <code>UrgentLetter</code> The
 * action letter is the same but the cost is doubled
>>>>>>> efd2b2b5363f9170dc061565dcff453c23346afb
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
