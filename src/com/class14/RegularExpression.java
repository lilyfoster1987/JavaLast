package com.class14;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello zeynep my num is4567894566";
		
		System.out.println(str.replaceAll("[0-9]", ""));
		
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
	
		System.out.println("*************************** ");
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		String str2="!@abgd987*&";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
		
		System.out.println("*************************");
		System.out.println(str.replaceAll("\\s",""));
		
	}

}
