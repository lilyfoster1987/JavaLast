package com.class13;

public class HowToPrintColorToConsol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//.contains();
		
		
	String str1="Today is Java Class";
	String str2="today is java   class";
	
	
		System.out.println("str1's length is "+str1.length());
		System.out.println("str2's length is "+str2.length());
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.contains("today"));
		System.out.println(str2.contains("java"));
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		System.out.println(str2.equalsIgnoreCase("str1"));
	}

}
