package letter;

import city.Inhabitant;
import letter.content.Content;

/**
 * A <code>Letter</code> contains a sender, a receiver and a content (anything)
 * Any <code>Letter</code> has an action which is execute when the <code>Letter</code> will be send
 * Each <code>Letter</code> has a cost
 */
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

	public Inhabitant sender() {
		return this.sender;
	}
	
	public Inhabitant receiver() {
		return this.receiver;
	}
	
	public abstract int cost();

	public void sendAction() {
		this.sender.pays(this.cost());
	}
	
	public abstract void receiveAction();

}