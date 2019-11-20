package com.oop;

public class Student {

	/*Assign and print the roll number, phone number and address 
	 * of two students having names "Sam" and "John" respectively 
	 * by creating two objects of class 'Student'.*/
	 
	String name, adress;
	int roll_no, phoneNum;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*Create a class named 'Student' with String variable 
		'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and 
		that of name as "John" by creating an object of the class Student.*/
		
		Student s1=new Student();
		s1.name="John";
		s1.roll_no=2;
		s1.adress="1287 timber";
		s1.phoneNum=12457896;
		System.out.println(s1.name+" by creating an object of the class ");
		Student s2=new Student();
		s2.name="Sam";
		s2.adress="1777 timber crreek";
		s2.phoneNum=125455223;
		s2.roll_no=1;
		System.out.println(s1.name+" is"+s1.roll_no+"and his phone number is "+s1.phoneNum);
	}

}
