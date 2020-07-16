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
	public void testToCreateAnAccountWithABalanceTen() {
		Account account = new Account();
		assertThat(account.balance()).isEqualTo(10);
	}
}
