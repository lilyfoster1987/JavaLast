package com.home.array;

import java.util.Scanner;

public class ArthurQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* First and Last Digit Sum
Write a program to find sum of first and last digit
The program needs to find the first and the last digit of number, using a loop and print the sum of the first and the last digit of that number.
If the number is negative than the program needs to print "Invalid value"
Example output:
252    Should print 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4
257    should print 9, the first digit is 2 and the last is 7 which gives us 2+7 and ht sum is 9
-10    sould print "Invalid value",  since number is negative and needs to be positive*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=scan.nextInt();
		
		int first=num%10;
		int last=0;
		for(int i =0; i<=num; i++) {
			
			last=num%10;
			num=num/10;
			
		}
	System.out.println(first);	
	System.out.println(last);
	
	System.out.println(first+last);
	
		
	}

}
