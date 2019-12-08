package com.abstractionss;

public class TestShape {
	public static void main(String[] args) {
		Circle	circle=new Circle(5) ;
		circle.calculateArea();
		circle.calculatePerimiter();
		System.out.println("****************");
		Square square=new Square(3);
		square.calculateArea();
		square.calculatePerimiter();
		}
}
