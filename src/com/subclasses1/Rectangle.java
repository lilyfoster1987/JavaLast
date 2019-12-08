package com.subclasses1;
/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize 
length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
class with its constructor having a parameter for its side (suppose s) calling the 
constructor of its parent class as 'super(s,s)'. 
Print the area and perimeter of a rectangle and a square.*/
public class Rectangle {
int a;
int b;
Rectangle(int a,int b){
	this.a=a;
	this.b=b;
}
public void area() {
	System.out.println("the area of shape is "+(this.a*this.b));
}
public void perimeter() {
	System.out.println("the perimeter of shape is "+(this.a+this.b)*2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle s1=new Rectangle(4,8);
s1.area();
s1.perimeter();
Square s2=new Square(5,5);
s2.area();
s2.perimeter();
Square[] s3=new Square[10];
int k=5;
for (int i = 0; i < s3.length; i++) {
	s3[i]=new Square(k,k);
	k++;
}
for (int i = 0; i < s3.length; i++) {
	s3[i].area();
	s3[i].perimeter();
	
}
	}

}
class Square extends Rectangle{

	Square(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}
