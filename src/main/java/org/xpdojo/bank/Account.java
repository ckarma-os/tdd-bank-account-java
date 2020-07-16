package org.xpdojo.bank;

public class Account {

	private int balance;

	public int balance() {
		return this.balance;
	}

	public void deposit(int balance) {
		this.balance += balance;
	}
}
