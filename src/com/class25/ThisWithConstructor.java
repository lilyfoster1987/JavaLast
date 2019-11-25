package com.class25;

public class ThisWithConstructor {
public ThisWithConstructor() {
	
	System.out.println("i am non argument constructor");
}
ThisWithConstructor(String str){
	this("zeyenp","hasan");

	
	//used to call current class constructor
	System.out.println("i am constructor with 1 String parameter");
}
ThisWithConstructor(String str,String str2){
	
		//used to call current class constructor
	System.out.println("i am constructor with 2 String parameter");
}
public static void main(String[] args) {
	ThisWithConstructor obj=new ThisWithConstructor("hello","bye");
	//we can execute 2constructors using this()
	System.out.println("**************************");
	ThisWithConstructor obj1=new ThisWithConstructor("zeynep");
	//we can execute 2constructors using this()
	System.out.println("*************************");
	ThisWithConstructor obj3=new ThisWithConstructor();
	//we can execute 2constructors using this()
	
}
}
