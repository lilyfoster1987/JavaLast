package com.home.array;

import java.util.Scanner;

public class ArthurQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Largest Prime
		Write a program to calculate largest prime factor of a give number
		If number is negative for does not have prime numbers, the program should print "Invalid value"
		Example input/output:
		21    sould print 7 since 7 is ghe largest primt (3 * 7 =21)
		217     should print 31 since 31 is the largest prime (7 * 31 = 217)
		45     should print 5 since 5 is the largest prime (3 * 3 * 5 = 45)
		-1    should print "Invalid number" since number is negative
		*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		int num=scan.nextInt();
		int a=0;
		if(num<0) {
			System.out.println("it is invalid number");
		}else {
			
			for(int i=2; i<=num; i++) {
				
				if(num%i==0) {
					
					a=i;
					num=num/i;
				}
			}
			
		}
		System.out.println(a);
	}

}
