package com.abstractionss;

/*Create an Interface 'Shape' with undeï¬?ned methods as 
calculateArea and calculatePerimiter . Create 2 child classes: 
	Circle & Square that should have an implementation of area and perimeter calculation. Test your code.*/

public interface Shape {
	public static final double PI=3.14;
public void calculateArea();
public void calculatePerimiter();

}
class Circle implements Shape{
int radius;
	Circle(int radius){
		this.radius=radius;
	}
	public void calculateArea() {
		System.out.println("Area of circle is "+PI*radius*radius);
		
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Perimeter of circle is "+(2*PI*radius));
		
	}
	
}
class Square implements Shape{
int length;
	Square(int length){
		this.length=length;
	}
	public void calculateArea() {
		System.out.println("the area of square is "+(length*length));
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("the perimeter of the square is "+(4*length));
		
	}
	
	
}