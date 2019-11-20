package com.home.data;

import java.util.Iterator;

public class TwinPrimeNumbers {
	/*Write a Java method to find all twin prime numbers less than 100.
	Go to the editor
	Expected Output: (3, 5)  (5, 7)  (11, 13) (17, 19)
	 (29, 31) (41, 43)  (59, 61) (71, 73)*/
	public static void main(String[] args) {
		int counter=0;
		int prime=0;
		for(int i =2; i<100; i++) {
			counter=0;
			prime=0;
			for(int j =2; j<i; j++) {
			if(i%j==0 || (i+2)%j==0) {
				counter=1;
				break;
				
			}
				
				
			}
			prime=i+2;
			if(counter==0 ) {
				if(i!=2 && prime!=4) {
				System.out.print("("+i+","+prime+")");
				}
				
				}
			
		}
		
	}
}
