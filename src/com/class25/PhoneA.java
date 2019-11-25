package com.class25;

public class PhoneA extends PhoneB {

	PhoneA(String make, String model, int memory, boolean camera, int price) {
		super(make, model, memory, camera, price);
	
	}
public void charge() {
	System.out.println("The phone "+model+" can be charged  by itself.");
}
	
}
