package com.class32;

public class Parent {
static void hello() {
	System.out.println("hello from super class");
}
}
class Child extends Parent{
	static void hello() {
		System.out.println("hello from child");
	}
	
}