package letter;

import city.Inhabitant;
import letter.content.Content;

public abstract class Letter<T extends Content> {

	protected final int BASIC_COST = 1;
	
	protected T content;
	protected Inhabitant sender;
	protected Inhabitant receiver;

	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public abstract int cost();
	
	public void action() {
		sender.city().sendLetter(this);
		sender.pays(this.cost());
	}
	
}