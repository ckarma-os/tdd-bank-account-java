package org.xpdojo.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AccountTest {
	
	@Test
	public void testToCreateAnAccountWithZeroBalance() {
		//When
		Account account = new Account();		
		//Verify
		assertThat(account.balance()).isEqualTo(0);
	}
	
	@Test
	public void testToCreateAnAccountWithGivenBalance() {
		//When
		Account account = new Account(10);		
		//Verify
		assertThat(account.balance()).isEqualTo(10);
	}
	
	@Test
	public void testToCreateAnAccountWithIncreasingBalance() {
		//Given
		Account account = new Account();		
		//When
		account.deposit(10);		
		//Verify
		assertThat(account.balance()).isEqualTo(10);
	}
	
	@Test
	public void testAccountWithMutipleDeposits() {
		//Given
		Account account = new Account();
		//When
		account.deposit(10);
		account.deposit(20);		
		//Verify
		assertThat(account.balance()).isEqualTo(30);
	}
	
	@Test
	public void testAccountToWithdrawAmount() {
		//Given
		Account account = new Account();
		account.deposit(10);
		//When
		account.withdraw(10);		
		//Verify
		assertThat(account.balance()).isGreaterThanOrEqualTo(0);
		assertThat(account.balance()).isEqualTo(0);
	}
}
