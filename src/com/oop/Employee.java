package com.oop;

public class Employee {
	/*Write a program that would print the information (name, year of joining, salary, address)
	 *  of three employees by creating a class named 'Employee'. The output should be as follows:
		Name        Year of joining        Address
		Robert            1994                64C- WallsStreat
		Sam                2000                68D- WallsStreat
		John                1999                26B- WallsStreat*/
	
	String name, adress;
	int year;
	public static void main(String [] args) {
		
		Employee e1=new Employee();
		e1.name="Robert";
		e1.year=1994;
		e1.adress="64C- WallsStreat";
		System.out.println("Name"+"           Year of Joining          Adress");
		System.out.println(e1.name+"           "+ e1.year+"           "+e1.adress);
		
		Employee e2=new Employee();
		e2.name="Sam";
		e2.year=2000;
		e2.adress="68D- WallsStreat";
		System.out.println(e2.name+"              "+ e2.year+"           "+e2.adress);
		Employee e3=new Employee();
		
		e3.name="John";
		e3.year=1999;
		e3.adress="26B- WallsStreat";
		System.out.println(e3.name+"             "+ e3.year+"           "+e3.adress);
		
	}
	
	
}
