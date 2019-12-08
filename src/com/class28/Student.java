package com.class28;

public class Student {
public void getGrade() {
	System.out.println("Student get grade...");
}
public void takeExam() {
	System.out.println("Student take exam...");
}
}
class SyntaxStudent extends Student{
	public void getGrade() {
		System.out.println("Student get grade...");
	}
	public void finishCourse() {
		System.out.println("Student will finish course in March...");
	}
}
class CollegeStudent extends Student{
	public void getGrade() {
		System.out.println("Student get grade at the ene of the somestry.");
	}
}
class SchoolStudent extends Student{
	public void takeExam() {
		System.out.println("Student dont take exams...");
	}
	
	}

