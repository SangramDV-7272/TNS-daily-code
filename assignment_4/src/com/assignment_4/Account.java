package com.assignment_4;

abstract class Account {
	
	protected double balance;
	protected String AccountNo;
	
	public Account(String AccountNo, double balance) {
		this.AccountNo = AccountNo;
		this.balance = balance;
	}
	
	public abstract void widrow(double amount);
	public abstract void deposit(double amount);
	public abstract double getBalance();
	
	public void displayAccountInfo() {
		System.out.println("Account No.: "+AccountNo);
	}
	
}
