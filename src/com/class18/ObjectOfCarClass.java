package com.class18;

public class ObjectOfCarClass {
public static void main(String [] args) {
	
	
	//to create an object syntax is
	//ClassName variable=new ClassName();
	
	Car car1=new Car();
	
	car1.make="Tesla";
	car1.model="S3";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	car1.drive();
	car1.accelerate();
	car1.start();
	//there are 2 objects as car1 and car2
	
	Car car2=new Car();
	car2.make="BMW";
	car2.model="I8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=6;
	car2.speed=500;
	
	car2.drive();
	car2.start();
	car2.accelerate();
	car2.reverse();
	car2.drive();
	car2.accelerate();
	car2.start();
	//print features of the car
	//i have black tesla
	System.out.println("i have"+ car1.color+" "+car1.make);
	System.out.println("i drive"+car2.make+car2.year);
	
	
}
}
