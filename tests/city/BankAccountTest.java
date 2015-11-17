package city;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTest {

	@Test
	public void goodBankAccount() {
		BankAccount bankAccount = new BankAccount();
		assertNotNull(bankAccount);
	}

	@Test
	public void shouldCreditAndDebit() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(5000, bankAccount.amountRemain());
		bankAccount.credit(5);
		assertEquals(5005, bankAccount.amountRemain());
		bankAccount.debit(10);
		assertEquals(4995, bankAccount.amountRemain());
	}

}
