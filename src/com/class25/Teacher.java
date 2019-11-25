package com.class25;
public class Teacher {
String name;
String lastname;
String email;
char gender;
int age;
String branch;
Teacher(String name,String lastname,char gender,String branch){
	this.name=name;
	this.lastname=lastname;
	this.email=email;
	this.gender=gender;
	this.age=age;
	this.branch=branch;
}
public void teach() {
	System.out.println(name+" "+lastname+" can teach "+branch);
	
}


}
