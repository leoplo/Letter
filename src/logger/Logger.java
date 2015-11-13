package logger;

/**
 * The <code>Logger</code> is a singleton that allows the display (here in the
 * terminal).
 */

public class Logger {
	static protected Logger uniqueInstance = null;

	private Logger() {

	}

	public static Logger getLogger() {
		if (uniqueInstance == null) {
			uniqueInstance = new Logger();
		}
		return uniqueInstance;
	}

	public void display(String message) {
		System.out.print(message);
	}
}
