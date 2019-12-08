package com.rewiewsuper;

public class Shape {

}
abstract class Shape2D{
	String color;

	public Shape2D(String color) {
		this.color = color;
	}

	public abstract double calculateArea(); // unimplemented

	public abstract double calculatePerimeter(); // unimplemented


}
class Square extends Shape2D {
	int side;

	public Square(int side, String color) {
		super(color);
		this.side = side;
	}

	@Override
	public double calculateArea() { // implemented
		return side * side;
	}

	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}

}
class Rectangle extends Shape2D{
	int width;
	int height;

	public Rectangle(int width, int height, String color) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		return width * height;
	}

	public double calculatePerimeter() {
		return 2 * (width + height);
	}

}
class Circle extends Shape2D{
	final double pi = 3.14;
	int radius;

	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}

	public double calculateArea() {
		return pi * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * pi * radius;
	}

	public double calculateDiameter() {
		return 2 * radius;
	}

}
abstract class Shape3D{
	String color;

	public Shape3D(String color) {
		this.color = color;
	}

	public abstract double calculateArea3D(); // unimplemented

	public abstract double calculatePerimeter3D(); // unimplemented
	
	public abstract double calculateVolume3D();
	
}
class Cube extends Shape3D{
int length;
	public Cube(int length,String color) {
		super(color);
		this.length=length;
		
	}

	@Override
	public double calculateArea3D() {
		
		return 6*(length*length);
	}

	@Override
	public double calculatePerimeter3D() {
		
		return 12*length;
	}

	@Override
	public double calculateVolume3D() {
		
		return length*length*length;
	}
	
}
class Sphere extends Shape3D{
double pi=3.14;
int radius;
	public Sphere(int radius,String color) {
		super(color);
		this.radius=radius;
	}

	@Override
	public double calculateArea3D() {
		
		return 4*pi*(radius*radius);
	}

	@Override
	public double calculatePerimeter3D() {
		
		return 2*pi*radius;
	}

	@Override
	public double calculateVolume3D() {
		
		return 4*(pi*(radius*radius*radius))/3;
	}
	
}
