package city;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import letter.Letter;
import letter.PromissoryNote;
import letter.SimpleLetter;
import letter.content.Content;
import letter.content.Money;
import letter.content.Text;
import letter.special.RegisteredLetter;
import letter.special.UrgentLetter;
import logger.Logger;

public class Main {

	public static int randomInt(int i) {
		Random random = new Random();
		return random.nextInt(i);
	}

	public static void main(String[] args) {
		City lille = new City("lille");
		List<Letter<? extends Content>> letters = new ArrayList<Letter<? extends Content>>();
		int i;
		Logger logger = Logger.getLogger();

		for (i = 0; i < 100; i++) {
			lille.addInhabitant(new Inhabitant("inhabitant" + i, lille));
		}

		Inhabitant inhabitant0 = lille.inhabitants.get(0);
		letters.add(new SimpleLetter(inhabitant0, inhabitant0, new Text(
				"blabla")));
		letters.add(new PromissoryNote(inhabitant0, inhabitant0, new Money(
				randomInt(10))));
		letters.add(new RegisteredLetter(inhabitant0, inhabitant0,
				new SimpleLetter(inhabitant0, inhabitant0, new Text("blabla"))));
		letters.add(new UrgentLetter(inhabitant0, inhabitant0,
				new SimpleLetter(inhabitant0, inhabitant0, new Text("blabla"))));
		letters.add(new RegisteredLetter(inhabitant0, inhabitant0,
				new RegisteredLetter(inhabitant0, inhabitant0,
						new SimpleLetter(inhabitant0, inhabitant0, new Text(
								"blabla")))));
		letters.add(new UrgentLetter(inhabitant0, inhabitant0,
				new PromissoryNote(inhabitant0, inhabitant0, new Money(
						randomInt(10)))));

		for (i = 1; i <= 6; i++) {
			logger.display("************************************ \n Day" + i
					+ "\n");
			lille.distributeLetter();
			for (int j = 0; j < randomInt(20); j++) {
				Letter<?> letter = letters.get(randomInt(letters.size()));
				letter.setSender(lille.inhabitants.get(randomInt(100)));
				letter.setReceiver(lille.inhabitants.get(randomInt(100)));
				lille.sendLetter(letter);
			}
		}

		while (lille.postbox.size() != 0) {
			i++;
			logger.display("************************************ \n Day" + i
					+ "\n");
			lille.distributeLetter();
		}
	}
}
