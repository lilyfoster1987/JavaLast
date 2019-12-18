package com.class34;

public class Instructor {
String name, lastName;
Instructor(String name, String lastName){
	this.name=name;
	this.lastName=lastName;
}
public void display() {
	System.out.println("instructor full name is "+name+" "+lastName);
}


}
