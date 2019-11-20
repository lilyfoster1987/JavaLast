package com.oop;

public class Triangle {
	/*Write a program to print the area and perimeter of 
	a triangle having sides of 3, 4 and 5 units by creating 
	a class named 'Triangle' without any parameter in its constructor.*/
	
int a,b,c;

	public int perimeter() {
		
	return(a+b+c);
		
		
	}
	public double area() {
		
	return((a*b)/2);
		
	}
	public static void main(String[] args) {
		
		Triangle m=new Triangle();
		m.a=3;
		m.b=4;
		m.c=5;
		
		System.out.println(m.perimeter());
		System.out.println(m.area());
		
		
	}
	
	
}
