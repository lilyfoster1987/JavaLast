package com.class22;

public class Student {

	public String name;
	public double GPA;
	public static String school;
	public void displayInfo(){
		System.out.println(name+" is attending"+"  " +GPA+school);
	}
	protected void study(int hours) {
		int localVariable=4;
		
		System.out.println(name+ " is studying for"+hours+"hours.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
