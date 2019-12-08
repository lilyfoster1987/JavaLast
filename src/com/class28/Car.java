package com.class28;

public class Car {
String make, model;
int year;
public Car() {
	System.out.println("i am non argument constructor");
}
public void display() {
	System.out.println("we build "+year+" "+make+" "+model);
}
public static void main(String[] args) {
	Car car=new Car();
	car.display();
	//int num;CE: we have to initialized
	//System.out.println(num);
	System.out.println("***********");
	Tesla car1=new Tesla();
	//car1.display();
}
}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		super();
		System.out.println("i am non argument constructor of child class");
	}
	
}