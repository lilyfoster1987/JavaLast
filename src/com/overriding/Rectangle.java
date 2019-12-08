package com.overriding;
/*Create a class named 'Rectangle' with two data members- length and breadth and a method to claculate the area which
 *  is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/
public class Rectangle {
int length;
int breadth;
Rectangle(){
	this.length=0;
	this.breadth=0;
}
Rectangle(int length,
int breadth){
	this.length=length;
	this.breadth=breadth;
}
Rectangle(int length){
	
	this.length=length;
	this.breadth=length;
}
public void area() {
	System.out.println(this.length*this.breadth);
	
}
public static void main(String[] args) {
	Rectangle obj1=new Rectangle();
	obj1.area();
	Rectangle obj2=new Rectangle(45,5);
	obj2.area();
	Rectangle obj3=new Rectangle(9);
	obj3.area();
}
}
