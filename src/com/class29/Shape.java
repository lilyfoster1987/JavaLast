package com.class29;
/*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle 
class. In circle class create a method to calculate the area of circle. Test your code*/
public class Shape {
double radius;
Shape(double radius){
	this.radius=radius;
	
}
public static void main(String[] args) {
	Circle circle=new Circle(5);
	circle.area();
}
}
class Circle extends Shape{
	

	Circle(double radius) {
		super(radius);
		
	}

	public void area() {
		System.out.println("the area of circle is "+(3.14*radius*radius));
	}
}

