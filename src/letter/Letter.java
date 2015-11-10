package letter;

import city.Inhabitant;
import letter.content.Content;

public abstract class Letter<T extends Content> {

	protected T content;
	protected int cost;
	protected Inhabitant sender;
	protected Inhabitant receiver;

	public Letter(Inhabitant sender, Inhabitant receiver, T content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public void action() {
		sender.city().postLetter(this);
		sender.pays(cost);
	}
}