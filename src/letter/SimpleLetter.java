package letter;

import city.Inhabitant;
import letter.content.Text;

public class SimpleLetter extends Letter<Text> {

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text content) {
		super(sender, receiver, content);
	}

	@Override
	public int cost() {
		return BASIC_COST;
	}

}
