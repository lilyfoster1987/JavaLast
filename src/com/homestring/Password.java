package com.homestring;

import java.util.Scanner;

/*Write a Java method to check whether a string is a valid password. 
Password rules: A password must have at least ten characters. 
A password consists of only letters and digits. 
A password must contain at least two digits.*/
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your password please");
		String password=scan.nextLine();
		char [] array=password.toCharArray();
		int length=array.length;
		int digit=0;
		int letter=0;
		if (length>=10) {
			for (int i = 0; i < length; i++) {
				if(Character.isDigit(array[i])) {
					digit+=1;
				}
				else if(Character.isLetter(array[i])) {
					letter+=1;
				}
				
				
		}
			System.out.println("digit number is "+digit);
			System.out.println("letter number is "+letter);
			if(digit>=2 && letter>=8 ) {
				System.out.println("the password is valid");
			}
			else {
				System.out.println("the password is invalid");
			}
		}else {
			System.out.println("A password must have at least ten characters. ");
		}
		
	}

}
