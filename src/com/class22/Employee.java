package com.class22;

public class Employee {
public String eId;
public double salary;
public static String CEO;
	public void info() {
		System.out.println(eId+ " 's ceo is "+CEO+"ind the salary of him/her is "+salary);
	}
	public static void main(String[] args) {
		
		
		Employee obj1=new Employee();
		obj1.eId="ZEYNEP";
		obj1.salary=45678;
		obj1.CEO="Sumair";
		
		Employee obj2=new Employee();
		obj2.eId="HASAN";
		obj2.salary=45678;
		obj2.CEO="Sumair";
		obj1.info();
		obj2.info();
		
	}

}
