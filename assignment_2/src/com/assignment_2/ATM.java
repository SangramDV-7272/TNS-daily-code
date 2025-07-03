package com.assignment_2;
import java.util.*;


class Method{
	public void choose()
	{
		System.out.println("\n =====ATM=====");
		System.out.println("Press 1 To Check Balance");
		System.out.println("Press 2 To Deposit");
		System.out.println("Press 3 To Withdraw");
		System.out.println("Press 4 To Exit");
		
	}
	
	
	public void Check_Balance(int Balance) {
		
		System.out.println("Your Balance is "+Balance+"\n" );
	};
	
	
	public int Deposit_Money(int Balance, int Deposit) 
	{
			System.out.println("Successful Deposit Your money "+Deposit+" in your Balance \n" );
			return Balance + Deposit;
	};
		
		
	public int Withdraw_Money(int Balance, int Withdraw) 
	{
				System.out.println("Successful Widraw Your money "+Withdraw+"\n");
				return Balance + Withdraw;
	};
	
	
	
}

public class ATM 
{
	public static void main(String [] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the TNS ATM");
		
		System.out.println("Enter your Password (12345) :");
		int user_password = sc.nextInt();

		if (user_password == 12345) 
		{
			
			Method user = new Method();
			
			int option = 0;
			int Balance = 1000;
			
			while(option != 4)
			{
				user.choose();
				option = sc.nextInt();
			
				switch(option)
				{
					case 1:
						user.Check_Balance(Balance);
						break;
						
					case 2:
						System.out.print("Enter deposit money \n");
						int Deposit = sc.nextInt();
						Balance = user.Deposit_Money(Balance, Deposit );
						break;
						
					case 3:
						System.out.print("Enter deposit money \n");
						int Withdraw = sc.nextInt();
						Balance = user.Withdraw_Money(Balance, Withdraw);
						break;
						
					case 4:
						System.out.println("Thank You For Use \n");
						break;
						
					default:
						System.out.println("Give correct option \n");
						break;
				}

			}
		}
		
	 }
		
}