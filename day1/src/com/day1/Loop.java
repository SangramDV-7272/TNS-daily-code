package com.day1;

import java.util.Scanner;

class Number2{
	
int n;
int t;
	
	public void input() 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("User Enter Number");
	n=sc.nextInt();
	
	for (int a = 2; a < 8; a++) 
	{
		if ( n%a == 0 && a!=4 && a!= 6)
		{
			t = 1;
		}

	};
	
	if ( t == 1)
	{
		System.out.println("Prime no.");
	}
	else
	{
		System.out.println("Non-Prime no.");
	};
	
	input();
		
	}
	

}	
public class Loop {

	public static void main(String[] args) {
		
		Number2 n= new Number2();
		n.input();
		
	}

}
