package com.oop;

import java.util.Scanner;



public class Avarege {
/*Print the average of three numbers entered by user by creating a class named 'Average' 
 * having a method to calculate and print the average.*/
	int a,b,c;
 public double  avr() {
	
	return((a+b+c)/3);
	
	 
 }
 
 
 public static void main(String[] args) {
	 Avarege num=new Avarege();
	 num.a=56;
	 num.b=78;
	 num.c=98;
	 System.out.println(num.avr());
	 
	 
	 
	 
 }
}
