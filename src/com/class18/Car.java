package com.class18;

public class Car {
//define attributes /fetaures
	
	String make,model,color;
	int year,wheels,windows,speed;
	
	// adding behaviors  methods();
	void drive() {
		
		System.out.println("Car"+make+" can drive");
	}
	
	void start() {
		System.out.println("car"+make+" can start");
	}
	void accelerate() {
		
		System.out.println("car "+make+" can accelerate");
	}
	void reverse() {
		System.out.println("car "+make+" can reverse");
	}
	
}
