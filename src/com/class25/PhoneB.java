package com.class25;

public class PhoneB extends PhoneC {
int screen;
	PhoneB(String make, String model, int memory, boolean camera, int price) {
		super(make, model, memory, camera, price);
		
	}
	
public void takePhoto() {
		
		System.out.println("The phone that is  "+model+" can take a photo.");
	}


}
