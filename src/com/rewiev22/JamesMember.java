package com.rewiev22;

public class JamesMember {
	String firstName;
	static String lastName;
	char gender;
	int salary;
	static int count;
	 static int monthlyIncome;
	public void increment() {
		 count++;
		
	}
	public void display() {
		
		System.out.println(firstName+" "+lastName+" "+ gender);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
