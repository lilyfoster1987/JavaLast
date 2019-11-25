package com.class25;

public class PhoneC {
	static String make;
	String model;
	int memory;
	boolean camera;
	int price;
	PhoneC( String make,String model,int memory,boolean camera,	int price){
		this.make=make;
		this.model=model;
		this.memory=memory;
		this.camera=camera;
		this.price=price;
		
	}
public void save() {
		
		System.out.println("This phone "+model+" can save files in it's memory that is "+memory+" GB.");
	}
	
}
