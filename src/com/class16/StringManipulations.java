package com.class16;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string is a class in java lang package
		// 2 ways to create a string
		
		//first way is using string literal 
		String str=new String();
		
		// second way using keyword- creatin string object
		String str1="hello";
		
		
		System.out.println(str.length());
		str.toLowerCase();//hello
		str.toUpperCase();//HELLO
		//*******************************************************
		/*String str3=null;
		boolean isEmpty=str3.isEmpty();//no value at all it is equal to
		System.out.println(isEmpty);
		*/
		//*******************************************************
		// how to verify existence of characters in the string 
		
		String a="Good evening students";
		System.out.println(a.contains("student"));
		
		//******************************************************
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
	}

}
