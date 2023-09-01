package com.shiristi.absdemos;

public class Accountsaving extends Banks {
	public Accountsaving(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (amount > 0 && amount <= balance - 500) {
			balance -= amount;
			System.out.println(amount + " withdrawn from savings account");
		} else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	void deposit(double amount) {
		if (amount > 100) {
			balance += amount;
			System.out.println(amount + " deposit to savings account");
		} else {
			System.out.println("Enter valid amount");
		}
	
	

}
