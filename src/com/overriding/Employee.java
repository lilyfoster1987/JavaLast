package com.overriding;
/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.*/
public class Employee {
static	int salary;
	int hours;
	public void getInfo() {
		System.out.println("The salary is "+salary+" and works "+hours+" hours.");
	}
	public void AddSal() {
		if (salary<500) {
		salary=salary+10;}
		else {
		salary=salary;
		}
	}
	
	public void AddWork() {
		if(hours<6) {
			salary=salary+5;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj=new Employee();
obj.hours=5;
obj.salary=400;
obj.AddSal();
obj.AddWork();
obj.getInfo();

	}

}
