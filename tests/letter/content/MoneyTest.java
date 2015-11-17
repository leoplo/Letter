package letter.content;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest extends ContentTest {

	public Content createContent() {
		return new Money();
	}

	@Test
	public void shouldHaveMoney() {
		Money aLotOfMoney = new Money(5000);
		assertEquals(5000, aLotOfMoney.value());
	}
}
