package com.home.data;
import java.lang.Math;
import java.util.Scanner;

public class KacHarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String a=scan.nextLine();

		int sayac=0;
		int sayac1=0;
		int sayac2=0;
		int sayac3=0;
		int sayac4=0;
		int sayac5=0;
		int sayac6=0;
		int sayac7=0;
		int sayac8=0;
		int sayac9=0;
	
	
	int b=a.toLowerCase().length();
	
char[] alphabet= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','u','p','r','s','t','u','z','w','x','v'};
	
	
		
	for(int i=0; i<=b-1; i++) {
		for(int j=0; j<alphabet.length; j++) {
		if(a.charAt(i)==alphabet[j] ) {
			System.out.println("a harfi "+(i+1)+". siradadir");
			sayac++;
			System.out.println(sayac+"tane a.charAt(i) harfi vardir");
		}
		
		
	
	


	}

}
