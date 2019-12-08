package com.subclasses1;
/*Create a class named 'Shape' with a method to print "This is This is shape". 
Then create two other classes named 'Rectangle', 'Circle' inheriting the 
Shape class, both having a method to print "This is rectangular shape" and 
"This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle'
having a method to print "Square is a rectangle". 
Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
public class Shape {
public void print() {
	System.out.println("this is this shape");
}

}
class Rec extends Shape{
	public void printr() {
		System.out.println("this is Rectangle shape");
	}
}
class Circ extends Shape{
	public void print() {
		System.out.println("this is circle shape");
	}
	
}
class Squar extends Rec{
	public void printr() {
		System.out.println("square is a rectangle");
	}
}
class TestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Squar obj=new  Squar();
			 obj.print();
			 obj.printr();
		}
	

}

