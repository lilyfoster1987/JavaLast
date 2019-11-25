package com.class26;

public class Addition {
	public void add(int a,int b) {
		
	}
public void add(int a,int b,int c) {
		
	}
public void add(double a,double b) {
	
}
public double add(double a,int b) {
	double c=a+b;
	return c;
}
/*public int add(double a,int b) {
	double c=a+b;
	return c;
}*/
// we can not change return type

public static void main(String[] args) {
	Addition ob=new Addition();
	ob.add(45, 5);
	ob.add(45, 45,68);
	ob.add(1.3, 45);
}
}
