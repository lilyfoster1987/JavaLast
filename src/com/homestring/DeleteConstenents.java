package com.homestring;

public class DeleteConstenents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Hello, have a good day";



for(int i=0; i<str.length(); i++) {
	
	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' ||str.charAt(i)=='u' || str.charAt(i)=='i' ||str.charAt(i)==',' || str.charAt(i)==' ' )
	{
		
		System.out.print(str.charAt(i));
	}
	
	
	
	
}

String sentence = "Hello, have a good day";

String noVowel = sentence.toLowerCase().replaceAll("[bcdfghjklmnpqrstvwxyz]", "");


System.out.println(noVowel);



	}
	
	
	

}
