package com.class25;
/*Write program as a Student class   that has instance variables name and address.
 *  Create a constructor that will initialize those variables. Print name & address
 *   of given  student by the displayInfo method.
*/
public class Student {
String name;
String adress;
Student(String name,String adress){
	
	this.name=name;
	this.adress=adress;
}
public void display() {
	System.out.println("The student's name is "+name+" and the adress of him/her is  "+adress);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student1=new Student("zeynep","timber creek road 23");
student1.display();
System.out.println("*********************");
Student student2=new Student("Hasan","timber creek road 2893");
student2.display();

	}

}
