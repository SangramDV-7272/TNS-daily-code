package com.assignment_4;

public class Bank {
	
	private static int TotalAcount = 0;

	public Bank() {
		TotalAcount++;
	}
	
	public static int getAccountNo() {
		return TotalAcount;
	}
	
}
