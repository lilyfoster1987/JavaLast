package com.class23;

public class StaticVsNonStatic {

	static String school="Syntax";
	
	String name;
	char grade;
	//instance method
	void getinfo() {
		System.out.println("my name is "+name+ " and i am going to "+school+" and my grade is "+grade);
	}
	//sataic method
	static void getInfo1() {
		//we can only static variables
	//	System.out.println("my name is "+name);name is non static variable
		System.out.println("I am attending classes at "+school);
	}
	
	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getinfo();
		getInfo1();
		System.out.println(school);
		System.out.println(StaticVsNonStatic.school);
		System.out.println(obj.school);

	}

}
