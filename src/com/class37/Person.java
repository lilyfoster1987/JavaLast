package com.class37;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*Create a Person class with following private fields: name, lastName,
age, salary. 
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. 
In that map store 
personId and a Person Object. Print each object details.*/
public class Person {
String name, lastname;
int age, salary;
public Person(String name, String lastname, int age, int salary) {
	this.name=name;
	this.lastname=lastname;
	this.age=age;
	this.salary=salary;
	
}
public void display() {
	System.out.println(name+" "+ lastname+" "+age+" and salar is "+salary);
}
public static void main(String[] args) {
	Map<Integer, Person> person=new TreeMap<>();
	person.put(1, new Person("zeynep","celik",35,3000));
	person.put(2, new Person("hasan","celik",50,5000));
	person.put(3, new Person("ali","yildiz",40,8000));
	Set<Entry<Integer,Person>> ent=person.entrySet();
	for(Entry<Integer,Person> get:ent) {
		get.getValue().display();
	}
}
}
