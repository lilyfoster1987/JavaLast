package com.home.array;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*.Write a program to calculate the factorial of a given number. (8!=?)
Example
Input=8;
Output= 40320*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int fac=1;
		for(int i=num; i>=1; i--) {
			
			fac=fac*i;
		}
		System.out.println(fac);
	}

}
