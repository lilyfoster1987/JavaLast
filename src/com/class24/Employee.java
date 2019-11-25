package com.class24;

public class Employee {
	String name;
	 String lastName;
	int employeeId;
	 String startDate;
	 int salary;
	 
	 Employee(String name1,
	 String lastName1,
	int employeeId1,
	 String startDate1,
	 int salary1){
	   name=name1;
	 lastName=lastName1;
	 employeeId=employeeId1;
	startDate=startDate1;
	salary=salary1;

	 }
	 Employee(){
	   
	 }
	 public void print(){
	   System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	 }
	}
