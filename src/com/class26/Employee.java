package com.class26;

public class Employee {
	public int salary;
	protected int employeeId;
	public static String companyName="Syntax";
	private String employeeSsn;

	void work() {
		System.out.println("I work in " + companyName + " company");
	}

	void getPaid() {
		System.out.println("I get paid " + salary);
	}
}