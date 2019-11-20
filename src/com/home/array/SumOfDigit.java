package com.home.array;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		
		/*Write a program to calculate sum of its digits?
		 Example
		 Input=1234
		 Output=10*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		int sum=0;
		
//		for (int i = 0; i <= num+1; i++) {
//			sum+=num%10;
//			num/=10;
//		}
		int sayac=0;
		while (num>0) {
			sum+=num%10;
			num/=10;
			sayac++;
		}
		
		
		System.out.println(sum);
		System.out.println(sayac);
		scan.close();
		}
		
	
	
}
