package city;

import java.util.ArrayList;
import java.util.List;

import letter.Letter;

public class City {
	protected String name;
	protected List<Letter<?>> postbox;
	protected List<Inhabitant> inhabitants;

	public City(String name) {
		this.name = name;
		this.postbox = new ArrayList<Letter<?>>();
		this.inhabitants = new ArrayList<Inhabitant>();
	}

	public void sendLetter(Letter<?> letter) {
		this.postbox.add(letter);
	}

	public void distributeLetter() {
		for (Letter<?> letter : postbox) {
			letter.action();
		}
	}

}
