package com.rewievstringmanipulations;

public class SubStringDemo {
	public static void main(String[] args) {
		
	
String a="121";
	String[] b=a.split("");
	String c="";
	System.out.println(b.length);
for (int i =b.length-1; i >= 0; i--) {
	c=c+b[i];
}
	System.out.println(c);
	if (a.equals(c))
	{
		
		System.out.println("it is polindrom");
		
	}else {
		System.out.println("it is not polindrom");
	}
	}}
		
		