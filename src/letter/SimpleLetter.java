package letter;

import city.Inhabitant;
import letter.content.Text;

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

	@Override
	public String getDescription() {
		return "simple letter whose content is a text content (" + this.content.value() + ")";
	}
}