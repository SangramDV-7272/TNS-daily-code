package com.day1;

import java.util.Scanner;

class Number{
	
	int n;
	
	public void input() 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("User Enter Number");
	n=sc.nextInt();
	
	if (n%2==0) {
		System.out.println("Number is Even");
		
		
	}
	else {
		System.out.println("Number is Odd");
		input();
	}
	input();
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		
		Number n = new Number();
		n.input();

	}

}
