package com.rewiev22;

public class Car {

	String make;
	String color;
	public Car() {
		
		
	}
	public Car(String type, String carColor) {
		
		make=type;
		color=carColor;
	}
	public void display() {
		System.out.println("this car is "+make+" and its color is "+color);
	}
}
