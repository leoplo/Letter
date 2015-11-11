package letter.content;

public class Text implements Content {

	protected String message;
	
	public Text(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
