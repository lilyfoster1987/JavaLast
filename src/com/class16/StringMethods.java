package com.class16;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java classes at Syantax are awesome";
		String str2=str.replace("awesome", "great");
		
		System.out.println(str2);
		System.out.println(str.replace("a","12345%^&"));
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]","" ));//itWRITES ONLY CHAR AND NUMBERS
		
		//split
		
		
	String[]  s=str.split("a");
	System.out.println(s.length);
				
	for(String s1:s) {
		
		System.out.println(s1);
	}
		
	
	
	}

}
