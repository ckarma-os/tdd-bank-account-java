package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AccountTest {
	
	@Test
	public void testToCreateAnAccountWithZeroBalance() {
		Account account = new Account();
		assertThat(account.balance()).isEqualTo(0);
	}
	
	@Test
	public void testToCreateAnAccountWithIncreasingBalance() {
		Account account = new Account();
		account.deposit(10);
		assertThat(account.balance()).isEqualTo(10);
	}
	
	@Test
	public void testAccountWithMutipleDeposits() {
		Account account = new Account();
		account.deposit(10);
		account.deposit(20);
		assertThat(account.balance()).isEqualTo(30);
	}
	
	@Test
	public void testAccountToWithdrawMoney() {
		Account account = new Account();
		account.withdraw(10);
		int balance = account.balance();
		assertThat(account.balance()).isGreaterThanOrEqualTo(0);
	}
}
