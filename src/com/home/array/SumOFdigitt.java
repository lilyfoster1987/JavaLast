package com.home.array;

import java.util.Scanner;

public class SumOFdigitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int digit=0;
		int sum=0;
		int sayac=0;
		for (int i = 0; i < num; i++) {
			
			digit=num%10;
			sum=sum+digit;
			
			num=num/10;
			sayac++;
			if(num==1 || num==2) {
				digit=num;
				sum=sum+digit;
				sayac++;
			}
			
			
			
		}
		System.out.println(sum);
		System.out.println(sayac);
	}

}
