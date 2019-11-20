package com.class22;

public class Students {
	String studentName;
	int studentId;
	static int numberOfStudents;
	public void info() {
		System.out.println("student name is "+studentName+" id is "+studentId+" and numbers of students is "+numberOfStudents);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Create three variables studentName , studentID and numberOfStudents
		 ● Create three objects of the Students Class
		 ● Set the value for studentName , studentID and increment the numberOfStudents for each object
		 ● Print out total number of students*/
		Students obj1=new Students();
		obj1.studentName="zeynep";
		obj1.studentId=12;
		obj1.numberOfStudents++;
		obj1.info();
		Students obj2=new Students();
		obj2.studentName="hasan";
		obj2.studentId=14;
		obj2.numberOfStudents++;
		obj2.info();
		
		Students obj3=new Students();
		obj3.studentName="ali";
		obj3.studentId=145;
		obj3.numberOfStudents++;
		
		obj3.info();
		
	}

}
