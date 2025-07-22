package com.assignment_4;

public class Transaction {
	private final double transactionFee = 5.0;
	
	public final void perTransection(Account account, double amount, String type) {
		if (type.equals("deposit")) {
			account.deposit(amount);
		}
		else {
			account.widrow(amount + transactionFee);
			System.out.println("transaction Fee is Applied: "+transactionFee);
		}
	}
	
}
