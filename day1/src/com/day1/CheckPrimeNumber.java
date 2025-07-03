package com.day1;

import java.util.Scanner;

class Number1{
	
int n;
	
	public void input() 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("User Enter Number");
	n=sc.nextInt();
	
	if ((n%2==0 ||  n%3==0 || n%4==0 || n%5==0 || n%6==0 || n%7==0) && n!=2 && n!=5 && n!=7  && n!=3 )
	{
		System.out.println("Number is  non Prime");
		System.out.println();
		
		
	}
	
	else {
		System.out.println("Number is Prime ");
		System.out.println();
	}
	
	input();
	
	
	}
}	
public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		Number1 n= new Number1();
		n.input();
		
	}

}
