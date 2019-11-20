package com.homestring;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two word");
		String a=scan.nextLine();
		String b=scan.nextLine();
		
		char[] s1=a.toCharArray();
		char[] s2=b.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		int sayac=0;
		int c1=s1.length;
		int c2=s2.length;
		if(c1==c2) {
		for(int i=0; i<c1; i++) {
		if(s1[i]==s2[i]) {
			sayac+=1;
		}
		}
		System.out.println(sayac);
		}
	
	if(sayac==c1) {
		System.out.println(a+" and "+ b +" are anagram words");
	}else
	{
		System.out.println(a+" and "+ b +" are not  anagram words");
	}
	}

}
