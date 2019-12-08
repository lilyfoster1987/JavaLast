package arryofobjects;

import java.util.Scanner;

/*Write a program to print the roll number and average marks of 8 students
in three subjects (each out of 100). The marks are entered by user.*/
public class Student {
	int rollNumber;
	double avarage;
	
	public void avarege() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your marks");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(this.rollNumber+" "+(a+b+c)/3);
	}
	public static void main(String[] args) {
	Student s1=new Student();
	s1.rollNumber=10;
	Student s2=new Student();
	s2.rollNumber=20;
	Student s3=new Student();
	s3.rollNumber=30;
	Student[] array=new Student[3];
	array[0]=s1;
	array[1]=s2;
	array[2]=s3;
	for (int i = 0; i < array.length; i++) {
			array[i].avarege();
	}
	}
	

}
