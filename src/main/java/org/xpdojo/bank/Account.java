package org.xpdojo.bank;

public class Account {

	private int balance;
	
	public Account() {
	}

	public Account(int openingBalance) {
		this.balance = openingBalance;
	}

	public int balance() {
		return this.balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;		
	}
}
