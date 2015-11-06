package letter;

import city.Inhabitant;
import letter.content.Content;

public abstract class Letter<T extends Content> {
	
	protected T content;
	protected int cost;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	public Letter (T content){
		
	}
	
	public abstract action();
}
