package com.day1;
import java.util.Scanner;

class User{
	int age;
	
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
	System.out.println("Enter Your Age ");
	age = sc.nextInt();
	
	
	if(age>18 && age<65) {
		System.out.println("You are eligible for blood donation");
	}
	
	else {
		System.out.println("Not eligible for blood donation");
		input();
	}
}
}
public class Voter {

	public static void main(String[] args) {
		
		User ur = new User();
		ur.input();
		// TODO Auto-generated method stub

	}

}


