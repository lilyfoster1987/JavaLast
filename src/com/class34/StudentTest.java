package com.class34;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int studentId;
	public Student(String name,int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	public void display() {
		System.out.println("my name is "+name+" id is "+studentId);
	}
}
public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		Student stu=new Student("john",101);
		Student stu1=new Student("jane",102);
		Student stu2=new Student("jack",103);

		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		//display each loop
		stu.display();
		stu1.display();
		//for each loop
		for (Student s:students) {
			s.display();
		}
		//adding more object of a student type
		students.add(new Student("micheal",104));
		students.add(new Student("david",105));
		students.add(new Student("esra",106));
		System.out.println("*************only micheal**************");
		//display into of each student
		Iterator<Student> it=students.iterator();
		while(it.hasNext()) {
			Student s1=it.next();
			if(s1.name.equals("micheal")) {
				s1.display();
				
			}
		}
				
		 ArrayList<Integer> arr=new ArrayList<>();
		    
		    arr.add(111);
		    arr.add(222);
		    arr.add(333);
		    arr.add(444);
		    arr.add(555);
		    arr.add(666);
		    System.out.println(arr);
		 arr.clear();
		    System.out.println(arr);
		
	}

}
