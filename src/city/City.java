package city;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;
import letter.content.Content;

/**
 * A <code>City</code> is like a distributor office : a city gathers all the
 * post letter and will send them tomorrow
 */
public class City {
	protected String name;
	protected List<Letter<? extends Content>> postbox;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<? extends Content>> postman;

	public City(String name) {
		this.name = name;
		this.postbox = new ArrayList<Letter<? extends Content>>();
		this.inhabitants = new ArrayList<Inhabitant>();
		this.postman = new ArrayList<Letter<? extends Content>>();
	}

	public void addInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}

	public void sendLetter(Letter<? extends Content> letter) {
		this.postbox.add(letter);
		letter.sendAction();
	}

	public void distributeLetter() {
		for (Letter<? extends Content> letter : postbox) {
			postman.add(letter);
		}

		postbox.clear();

		for (Letter<? extends Content> letter : postman) {
			letter.receiveAction();
		}
		postman.clear();
	}
}
