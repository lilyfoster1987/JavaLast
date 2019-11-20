package com.class19;

import java.util.Scanner;

public class BuiltUserDefinedMethods {

	
	void myMethod() {//method are indepented and define indepented area
		System.out.println("this is user defined method that i created");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="hello";
str=str.replace("hello","hi");//these are already defined
System.out.println(str);


Scanner scan=new Scanner(System.in);//built methods in java library and you can not modified
scan.hasNextLine();
	
BuiltUserDefinedMethods obj=new BuiltUserDefinedMethods();

	obj.myMethod();



	}

}
