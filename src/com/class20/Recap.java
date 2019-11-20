package com.class20;

public class Recap {
	void methodName(String str) {
		System.out.println("heloo "+str);
	}
	void sum(int num1, int num2) {
		
		int c=num1+num2;
		System.out.println("the sum of 2 numbers is ="+c);
	}
	void sayHello(int times) {
		
		for(int i=0; i<times; i++) {
			System.out.println("hello");
			
			
		}
		
	}
	void saySomething(String smt, int time) {
		for(int i=0; i<time; i++) {
			System.out.println(smt);
			
			
		}
	}
	
public static void main(String[] args) {
	Recap obj=new Recap();
	obj.methodName("zeynep");
	obj.sum(55,45);
	obj.sayHello(5);
	obj.saySomething("hii", 3);
	
}
}
