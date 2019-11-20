package com.homemethods;

public class IsEven {
boolean even(int a) {
	
	boolean evenOrNot;
	if(a%2==0) {
		evenOrNot=true;
	}
	else {
		evenOrNot=false;
	}
	return evenOrNot;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a method named isEven that accepts an int argument. 
		The method should return true if the argument is even, or false otherwise.
				Also write a program to test your method.*/
		
		IsEven obj=new IsEven();
		boolean evenn=obj.even(9);
		System.out.println(evenn);
	}

}
