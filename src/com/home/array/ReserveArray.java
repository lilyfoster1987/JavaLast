package com.home.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReserveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);


int[] num1=new int [5];

for(int b=0; b<num1.length; b++) {
	
	System.out.print("enter the number of"+"num1["+b+"]");
	num1[b]=scan.nextInt();
	
}
		
	int[] num2=new int[5];
	
	
	for(int i=num2.length-1; i>=0; i--) {
		int j=0;
			num2[j]=num1[i];
			
			j++;
			
			
		}
	for(int x=0; x<num2.length; x++) {
		
		System.out.print(num2[x]+" ");
	}
		
		
	
	
	
	}

}
