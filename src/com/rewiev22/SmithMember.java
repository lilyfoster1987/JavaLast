package com.rewiev22;

public class SmithMember {

	String firstName;
	static String lastName;
	char gender;
	 int salary;
	static int count;
	 static int monthlyIncome;
	public void increment() {
		 count++;
		
	}
	public static void addIncome(int salary2) {
		
		monthlyIncome+=salary2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
