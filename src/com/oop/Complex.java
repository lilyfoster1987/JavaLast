package com.oop;

import java.util.Scanner;

public class Complex {

	/*Print the sum, difference and product of two complex numbers by 
	 * creating a class named 'Complex' with separate methods for each 
	 * operation whose real and imaginary parts are entered by user.
	 */
	int a,b;
	public int sum() {
		
		return(a+b);
	}
public int difference() {
		
		return(a-b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Complex num=new Complex();
Scanner scan=new Scanner(System.in);
System.out.println("enter a 2 number");
num.a=scan.nextInt();
num.b=scan.nextInt();
System.out.println(num.sum());
System.out.println(num.difference());

	}

}
