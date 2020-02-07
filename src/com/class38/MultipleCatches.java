package com.class38;

public class MultipleCatches {
public static void main(String[] args) {
	division(20,11);
	division(20,0);
	
	
}
public static void division(int num,int num1) {
	int result;
	try {
		result=num/num1;
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
	System.out.println("end of my method");
}
}
