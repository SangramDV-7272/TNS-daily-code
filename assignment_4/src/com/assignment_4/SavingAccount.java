package com.assignment_4;

public class SavingAccount extends Account  {

	public SavingAccount(String AccountNo, double balance) {
		super(AccountNo, balance);
	}

	@Override
	public void widrow(double amount) {
		balance -= amount;		
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
