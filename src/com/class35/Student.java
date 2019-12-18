package com.class35;

import java.util.HashSet;
import java.util.Iterator;

/*Create a Set collection that will hold Objects of Student Type. 
In this set we do not care about the insertion order. Each student 
object should have name and studentID.
Display name of each student.*/
public class Student {
	String name;
	int id;
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
public static void main(String[] args) {
	HashSet<Student> hset=new HashSet<>();
	hset.add(new Student("Zeynep",45));
	hset.add(new Student("Hasan",45));
	hset.add(new Student("Nilufer",45));
	hset.add(new Student("Berrin",45));
	hset.add(new Student("Ali",45));
	System.out.println("****first way******");
	for(Student s:hset) {
		System.out.println(s.name);
	}
	System.out.println("***second way*******");
	Iterator<Student> it=hset.iterator();
	while(it.hasNext()) {
		System.out.println(it.next().name);
		
	}
}
}
