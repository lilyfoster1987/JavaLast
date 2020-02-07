package com.class38;

public class SpecificToGeneral {
public static void main(String[] args) {
	int num1=10;
	int num2=20;
	int result;
	try {
		result=num1/num2;
		System.out.println(result);
		Thread.sleep(20);
	}catch(ArithmeticException e) {
		System.out.println("please do not pass o as a second number");
	}catch(InterruptedException e) {
		System.out.println("someone interrupted program sleeping");
	}
	catch(Exception e) {
		System.out.println("catcing all types of exceptions");
	}
}
}
