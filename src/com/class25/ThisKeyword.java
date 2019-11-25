package com.class25;

public class ThisKeyword {
int a,b;
public ThisKeyword(int a,int b) {
	this.a=a;
	this.b=b;
	
	
}
public ThisKeyword() {
	// TODO Auto-generated constructor stub
}

public void sayA() {
	System.out.println(a);
}
public void sayB() {
	System.out.println(b);
}
public void sayAandB() {
	this.sayA();
	this.sayB();
}
public void sum(int a,int b) {
	System.out.println("the sum of lacal variables is "+(a+b));
	System.out.println("the sum of instance variables is "+(this.a+this.b));
}
public static void main(String[] args) {
	ThisKeyword ob1=new ThisKeyword(20,40);
	ob1.sum(100, 200);
	ob1.sayA();
	ob1.sayB();
	ob1.sayAandB();
	
}
}
