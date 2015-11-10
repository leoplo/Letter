package letter;

import city.Inhabitant;
import letter.content.Text;

public class SimpleLetter extends Letter<Text> {

	public static final int COST = 1;

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender, receiver, text);
		cost = COST;
	}

}
