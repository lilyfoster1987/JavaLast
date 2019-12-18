package com.class33;

public class Wrapper {
public static void main(String[] args) {
	int num =10;
	//Autoboxing >>>>>>>>>>>>converting primitive into an object type
	
	Integer integer=100;
	System.out.println(integer.MIN_VALUE);
	String str=integer.toString();
	System.out.println(str);
	
	
	Boolean booln=true;
	Byte val=10;
	System.out.println(val.MIN_VALUE);
	System.out.println("******************");
	
	//Autoboxing >>>>>>>>>>converting object type into a primitive types
	int num1=new Integer(10);
	System.out.println(num1);
}
}
