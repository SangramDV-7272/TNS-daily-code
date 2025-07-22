package com.assignment_4;

public class Main {

	public static void main(String[] args) {
		Bank Ba1 = new Bank();
		Transaction Tx = new Transaction();
		
		Account Ac1 = new SavingAccount("San0001", 10000);
		
		Tx.perTransection(Ac1, 100, "deposit");
		Tx.perTransection(Ac1, 100, "widrow");
		Ac1.displayAccountInfo();
		System.out.println("Account Balance is "+Ac1.getBalance());
		System.out.println("Total Account No.: "+Ba1.getAccountNo());


	}

}
