package com.homestring;

import java.util.Scanner;

public class Occurans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Input a string of alphabets. Find out the number of occurrence of all alphabets in that string.
		Find out the alphabet with maximum occurrence.*/
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word");
		String a=scan.nextLine();
		int sayac=0;
		
		char[] s1=a.toLowerCase().toCharArray();
		
		char[] alphabet= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','u','p','r','s','t','u','z','w','x','v'};
	
	for (int j=0; j<s1.length; j++) {
		sayac=1;
		for(int i=0; i<alphabet.length; i++) {
		if(s1[j]==alphabet[i]) {
			
			sayac=sayac+1;
			System.out.println(s1[j]+" "+sayac+ " times");
		}
	}
	}
	System.out.println(sayac);
	}

}
