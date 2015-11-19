package letter.special;

import letter.Letter;
import letter.LetterTest;

public abstract class SpecialLetterTest extends LetterTest<Letter<?>> {

	@Override
	public abstract SpecialLetter createLetter();

	@Override
	public abstract void testCost();
	
	public abstract void shouldNotHaveUrgentLetter();
	
}
