package com.class31;

public interface Drivable {
	
	//public static final variables
	public static final boolean DRIVE_FAST=true;//we should use uppercase it is standart
	//by default compiler will add public abstract
public abstract void drive();
}
class Cars{
	Cars(){
		System.out.println("parent cons");
	}
	public void stop() {
		System.out.println("cars stops by pressing breaks");
	}
	
}
class Toyota extends Cars implements Drivable{
Toyota(){
	
	System.out.println("this is child cons");
}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("toyota can drive");
	}
	
}