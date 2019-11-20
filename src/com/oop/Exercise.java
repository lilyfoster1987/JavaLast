package com.oop;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to check if the two strings entered by user are anagrams or not.
		Two words are said to be anagrams if the letters of one word can be rearranged 
		to form the other word.
		For example, jaxa and ajax are anagrams of each other.*/
		
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		char[]st1=str1.toCharArray();
		char[] st2=str2.toCharArray();
		int a=st1.length;
		int b=st2.length;
		if(a>b)
		for(int i=0; i<a;i++) {
			for(int j=0; j<b; j++) {
				
			}
			
		}
	}

}
