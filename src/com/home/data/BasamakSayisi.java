package com.home.data;

import java.util.Scanner;

public class BasamakSayisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan sayi alip kac basamakli oldugunu yazdirmak
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int number=scan.nextInt();
		int sayac=0;
		
		while(number!=0) {
					
			number=number/10;
			
			sayac++;
			
		}
		
		System.out.println("number is "+sayac+" basamakli");
	
		
		
		
	}

}
