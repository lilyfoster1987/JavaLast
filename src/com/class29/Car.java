package com.class29;

public class Car {
String make, model;
Car(){
	System.out.println("i am parent class non argument constructur.");
}
Car(String make,String model){
	this.make=make;
	this.model=model;
	
	
}


}
class Tesla extends Car{
	boolean autopilot;
	Tesla(){
		super();
		System.out.println("i am child class constructor");
	}
	Tesla(String make,String model,boolean autopilot){
		super(make,model);
		this.autopilot=autopilot;
		
	}
	public void display() {
		System.out.println("car "+make+" "+model+" has an auto "+autopilot);
	}
}
