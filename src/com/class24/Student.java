package com.class24;
/*Write a java program of Class Students that takes
students name and 3 subject grades. Inside your class 
also have a method to Calculate Average Grade. Test Student class 
for 5 different students with different 
marks. Your program should print an average mark
of each students name.*/
public class Student {
String name;
int gradeOfEnglish;
int gradeOfMath;
int gradeOfHistory;

Student(String sname, int english,int math, int history){
	name=sname;
	gradeOfEnglish=english;
	gradeOfMath=math;
	gradeOfHistory=history;
	
	double avrg=(gradeOfEnglish+gradeOfMath+gradeOfHistory)/3;
	System.out.println("the student  "+ name+" has "+avrg);
}
public static void main(String[] args) {
	Student s1=new Student("hasan",45,85,90);
	Student s2=new Student("zeynep",45,90,90);
	Student s3=new Student("ali",45,40,90);
	Student s4=new Student("mehmet",45,100,90);
	Student s5=new Student("oya",45,50,70);
}
}
