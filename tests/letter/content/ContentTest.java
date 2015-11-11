package letter.content;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class ContentTest {
	
	public abstract Content createContent();

	@Test
	public void goodContentTest() {
		Content content = this.createContent();
		assertNotNull(content);
	}
}
