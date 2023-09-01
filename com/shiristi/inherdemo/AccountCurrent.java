package com.shiristi.inherdemo;

public class AccountCurrent extends Account{
	public AccountCurrent(double balance) {
		super(balance);
	}
	

	@Override
	void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println(500);
	}


	@Override
	void deposit(double amount) {
		System.out.println(2000);
	}

}
