package com.home.array;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		
		/*Write a program to calculate sum of its digits?
		 Example
		 Input=1234
		 Output=10*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int digit=0;
		int sum=0;
		for (int i = 0; i < num; i++) {
			
			digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println(sum);
	}
	
}
