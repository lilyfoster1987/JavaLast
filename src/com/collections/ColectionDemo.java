package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColectionDemo {
public static void main(String[] args) {
	Student[] arr=new Student[3];
	Student s1=new Student(123,19,"james");
	arr[0]=s1;
	arr[1]=new Student(2,56,"zeynep");
	arr[2]=new Student(1,8,"hasan");
	ArrayList<Student> list=new ArrayList<>();
	list.add(new Student(1,5,"jane"));
	list.add(new Student(8,6,"jan"));
	list.add(new Student(6,9,"jon"));
	list.add(new Student(4,45,"jine"));
	System.out.println(list.size());
	System.out.println(list);
	//non safe 
	List l=new ArrayList<>();
	l.add(s1);
	l.add(4);
	l.add(true);
	for(Student s:list) {
		s.display();
	}
	Iterator<Student> it=list.iterator();
	while(it.hasNext()) {
		Student sut=it.next();
		sut.display();
	}
	
}
}
class Student{
	String name;
	int age;
	int id;
	public Student(int id, int age, String name) {
		this.age=age;
		this.name=name;
		this.id=id;
		
	}
	public void display() {
		System.out.println("studen name : "+name+" age is "+age+"and id is" +id);
	}
}