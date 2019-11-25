package com.class25;

public class Animal {
	String name;
	int age;
	private Animal(String aName,int aAge) {
		name=aName;
		age=aAge;
	}
	public Animal(String aName) {
		name=aName;
		
	}
	protected Animal() {
		
	}
	//public static Animal(int aAge) {
		
	//	age=aAge;
	//}
	public void display() {
		System.out.println(name+" is "+age+" years old");
	}
	public static void main(String[] args) {
		Animal obj1=new Animal("bear",5);
		
	}

}
