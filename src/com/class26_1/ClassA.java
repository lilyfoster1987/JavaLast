package com.class26_1;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA obj1=new ClassA();
obj1.main();
obj1.zeynep();
obj1.zeynep("Celik");
String country=obj1.zeynep("Turkey",35);
System.out.println(country);
int age=obj1.zeynep(35);
System.out.println(age);
	}
	public static void main() {
		System.out.println("this is a review session");

	}
public void zeynep() {
		System.out.println("my name is zeynep");
	}
public void zeynep(String lastName) {
	System.out.println("my last name is zeynep");
	}
public String zeynep(String country,int age) {
	
	return country;
}
public int  zeynep(int age ) {
	return age;
}

}
