package city;

import java.util.ArrayList;
import java.util.List;


import letter.Letter;
import letter.content.Content;

public class City {
	protected String name;
	protected List<Letter<? extends Content>> postbox;
	protected List<Inhabitant> inhabitants;

	public City(String name) {
		this.name = name;
		this.postbox = new ArrayList<Letter<? extends Content>>();
		this.inhabitants = new ArrayList<Inhabitant>();
	}

	public void addInhabitant(Inhabitant inhabitant){
		inhabitants.add(inhabitant);
	}
	
	public void sendLetter(Letter<? extends Content> letter) {
		this.postbox.add(letter);
	}

	public void distributeLetter() {
		for (Letter<? extends Content> letter : postbox) {
			letter.action();
		}
	}

}
