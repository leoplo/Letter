package letter.content;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextTest extends ContentTest {

	public Content createContent() {
		return new Text();
	}
	
	@Test
	public void shouldContainMessage() {
		Text text = new Text("Hello World");
		assertEquals("Hello World", text.getMessage());
	}
}
