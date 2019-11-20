package com.homemethods;

import java.util.Scanner;

public class IsVowel {

	boolean vowel(char character) {
		boolean result;
		if (character=='e'|| character=='a'|| character=='o'|| character=='u'|| character=='i') {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a value-returning method, isVowel that returns the value true if 
		a given character is a vowel, and otherwise returns false. In main() method accept 
		a string from user and count number of vowels in that string.*/
		
		IsVowel str=new IsVowel();
		boolean result1=str.vowel('e');
		System.out.println("the vowel is "+result1);
		if(result1) {
			int counter=0;
			Scanner scan=new 	Scanner(System.in);
			System.out.println("Enter a string");
			String str1=scan.nextLine();
			for(int i=0; i<str1.length();i++) {
				if(str1.charAt(i)=='e') {
					counter++;
				}
			}
			System.out.println("number of e is "+counter);
		}
	}

}
