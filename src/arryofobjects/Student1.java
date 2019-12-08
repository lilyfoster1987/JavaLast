package arryofobjects;

import java.util.Scanner;

public class Student1 {
String name, lastName;
int rollNumber;
int course1, course2, course3, average;
public static int numberOfStudent=0;

Scanner scan=new Scanner(System.in);

Student1(){
	System.out.print("Name : ");
	name=scan.nextLine();
	
	System.out.print("Last name : ");
	lastName=scan.nextLine();
	
	System.out.print("Roll Number : ");
	rollNumber=scan.nextInt();
	
	System.out.print("Course 1 grade : ");
	course1=scan.nextInt();
	
	System.out.print("Course 2 grade : ");
	course2=scan.nextInt();
	
	System.out.print("Course 3 grade : ");
	course3=scan.nextInt();
}

public int average() {
	average=(course1+course2+course3)/3;
	return average;
}

public void displayStudentAverage() {
	System.out.println(name+" "+lastName+" average is : "+((course1+course2+course3)/3));
}
}

class StudentTest {

	public static void main(String[] args) {

		Student1[] student = new Student1[3];
		for (int i=0; i<student.length; i++) {
			student[i]=new Student1();			
		}
		
		int sumOfClassGrades=0;
		for (int i = 0; i < student.length; i++) {
			student[i].displayStudentAverage();
			sumOfClassGrades+=student[i].average();
		}
		
		System.out.println("The average of the class is "+ (sumOfClassGrades/student.length));
		
		
	}
	
	
}
