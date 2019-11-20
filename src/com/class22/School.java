package com.class22;

public class School {

	public static void main(String[] args) {
		// TDO Auto-generated method stub
Student student1=new Student();
student1.name="eric";//these are instance variables, we created class 
student1.GPA=3.125;//assignin instance variables
student1.school="Syntax";
student1.displayInfo();
student1.study(5);

Student student2=new Student();
student2.name="jamie";
student2.GPA=3.60;
student2.school="syntax techonolies";
student1.displayInfo();//static is belongs to class so it is not belongs to object
student2.displayInfo();

	}

}
