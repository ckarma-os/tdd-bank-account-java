package org.xpdojo.bank;

public class Account {

	private int balance;

	public int balance() {
		return balance;
	}

	public void deposit(int balance) {
		this.balance += balance;
	}
}
