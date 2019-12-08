package com.overriding;
/*Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of Student class, then the name 
should be "Unknown", otherwise the name should be equal 
to the String value passed while creating object of Student class.*/
public class Student {
	String name;
Student(String name){
	this.name=name;
}
Student(){
	this.name="unknown";
}
public static void main(String[] args) {
	Student obj=new Student();
	Student obj1=new Student("zeynep");
	System.out.println(obj.name);
	System.out.println(obj1.name);
	
}
}
