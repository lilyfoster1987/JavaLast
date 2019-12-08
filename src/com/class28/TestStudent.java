package com.class28;

public class TestStudent {
	public static void main(String[] args) {
		Student syntaxStudent1=new SyntaxStudent();
		syntaxStudent1.getGrade();
		
SyntaxStudent syntaxStudent2=new SyntaxStudent();
	syntaxStudent2.getGrade();
	syntaxStudent2.takeExam();
	syntaxStudent2.finishCourse();
	System.out.println("*********************");
	Student collegeStudent1=new CollegeStudent();
	collegeStudent1.getGrade();
	collegeStudent1.takeExam();
	
	CollegeStudent collegeStudent2=new CollegeStudent();
	collegeStudent2.getGrade();
	collegeStudent2.takeExam();
	System.out.println("*****************");
	
	Student schoolStudent1=new SchoolStudent();
	schoolStudent1.getGrade();
	schoolStudent1.takeExam();
	SchoolStudent schoolStudent2=new SchoolStudent();
	schoolStudent2.getGrade();
	schoolStudent2.takeExam();
	
}
}
