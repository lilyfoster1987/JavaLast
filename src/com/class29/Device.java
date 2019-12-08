package com.class29;

public class Device {
String  deviceType,name;
Device(String deviceType,String name){
	this.deviceType=deviceType;
	this.name= name;
	
}
}
class Apple extends Device{

	Apple(String deviceType, String name) {
		super(deviceType, name);
		
	}
	
}