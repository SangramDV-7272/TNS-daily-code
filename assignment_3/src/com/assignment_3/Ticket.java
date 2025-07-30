package com.assignment_3;

public class Ticket {
	
	private String Show_name, Buyer_Name, Payment_Type;
	private int Amount , No_of_Seat; 
	
	void display() {
		System.out.println("\n.... Recipt ....");
		System.out.println("Show Name: "+Show_name);
		System.out.println("User Name: "+Buyer_Name);
		System.out.println("No of Seat: "+No_of_Seat);
		System.out.println("Amount: "+Amount);	
		System.out.println("Pyment Type: "+Payment_Type);	
		
	}
	
	public void makePyment(String Show_name, String Buyer_Name, int No_of_Seat, int Amount, String Payment_Type) {
		this.Amount = Amount;
		this.No_of_Seat = No_of_Seat;
		this.Show_name = Show_name;
		this.Buyer_Name = Buyer_Name;
		this.Payment_Type = Payment_Type;
		display();
	}
	

}
