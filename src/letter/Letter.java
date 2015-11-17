package letter;

import city.Inhabitant;
import letter.content.Content;

public abstract class Letter<C extends Content> {

	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;

	public Letter(Inhabitant sender, Inhabitant receiver, C content) {
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