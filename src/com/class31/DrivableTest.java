package com.class31;

public class DrivableTest {
public static void main(String[] args) {
	Drivable obj=new Toyota();
	obj.drive();
	//obj.DRIVE_FAST=true;CE:FINAL VALUE CAN NOT BE REASSIGNED
	Toyota car=new Toyota();
	car.drive();
	car.stop();
	
	
}
}
