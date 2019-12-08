package com.class28;

public class Animal {
public static void whoAnimal() {
	System.out.println("i am an animal");
}
}
class Monkey extends Animal{
/*	public  void whoAnimal() {
		System.out.println("i am an animal");
	}*/
	//we cannot override static methods
    // when both methods are static within Sub and Super class it is
    //method hiding

	public static void whoAnimal() {
		System.out.println("i am an monkey");
	}
	
}