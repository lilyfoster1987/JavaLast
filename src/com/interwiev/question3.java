package com.interwiev;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="123hzeynep23#$%";
		
		
		String str1=str.replaceAll("[a-zA-Z]", "");
		System.out.println(str1.length());
		
		System.out.println(str1);
		
	}

}
