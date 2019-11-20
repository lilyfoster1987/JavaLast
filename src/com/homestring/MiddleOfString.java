package com.homestring;

import java.util.Scanner;
//TODO Auto-generated method stub
		/*1. Write a Java method to display the middle character of a string. Note: a) If the length of the string is odd there will be two middle characters.
	b) If the length of the string is even there will be one middle character.
	Test Data: Input a string: 350  Expected Output:The middle character in the string: 5
	*/
public class MiddleOfString {
	void middle(String str) {
		
		
		
char [] array=str.toCharArray();

int a=array.length;
if (a%2==0)
{
	System.out.println(array[a/2-1]+" "+array[a/2]);
	
}else {
	System.out.println(str.charAt(a/2));
}
	}
	public static void main(String[] args) {
		
		MiddleOfString obj=new MiddleOfString();
		obj.middle("WEDNESDAY");
		obj.middle("ZEYNEP");
		

	}

}
