package com.assignment_3;
import java.util.*;

public class Booking_type {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket obj = new Ticket();
		String Bank_Name;
		
		System.out.println(".... Stage Show Booking ....");
		
		System.out.print("Enter Show name: ");
		String Show_Name = sc.nextLine();
		
		System.out.print("Enter Your Name: ");
		String Name_Buyer = sc.nextLine();
		
		System.out.print("Enter No. of Seat: ");
		int No_of_Seat = sc.nextInt();
		
		int Amount = 200 * No_of_Seat;
		System.out.println("Your Ticket Amount: "+Amount);
		
		System.out.println("\nPayment Method: ");
		System.out.println("1. Cash ");
		System.out.println("2. Card ");
		System.out.println("3. UPI ");
		
		System.out.print("Enter Payment method No.(1/2/3): ");
		int Choise = sc.nextInt();
		sc.nextLine();
		
		switch( Choise ) {
		
		case (1):
			obj.makePyment(Show_Name, Name_Buyer, No_of_Seat, Amount, "Cash");
			break;
			
		case (2):
			System.out.println("\n...Enter Card Deteil...");
			System.out.println("Enter Bank Name: Kotak Bank");
//			Bank_Name = sc.nextLine();
//			System.out.println("Enter Bank Name: "+Bank_Name);
			
			System.out.print("Enter Card Number: ");
			int card_Number = sc.nextInt();
			
			System.out.print("Enter OTP: ");
			int pass = sc.nextInt(); 
			if (pass == 12345) {
				obj.makePyment(Show_Name, Name_Buyer, No_of_Seat, Amount, "Card");
			}
			else {
				System.out.println("\nInvalid Password Try again....");
			};
			break;
			
		case (3):
			System.out.println("\nEnter UPI Deteil:...... ");
			System.out.print("Enter UPI ID: ");
			String UPI_ID = sc.nextLine();
		    
			
			System.out.print("Enter Password: ");
			if (sc.nextInt()==123456) {
				obj.makePyment(Show_Name, Name_Buyer, No_of_Seat, Amount, "UPI");
			}
			else {
				System.out.println("\nInvalid Password Try again....");
			}
			break;
			
		default :
			System.out.print("\nInvalid Choise Try again....");
			break;
		}			
		
	}
}
