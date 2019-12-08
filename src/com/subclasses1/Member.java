package com.subclasses1;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an employee and a manager by
making an object of both of these classes and print the same.*/
public class Member {
	String name;
	int age;
    String phoneNumber;
    String address;
	int salary;
	public void printSalary() {
		System.out.println("the salary is "+salary);
	}
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.name="zeynep";
		obj1.age=35;
		obj1.phoneNumber="456789456";
		obj1.address="timber creek";
		obj1.salary=50000;
		obj1.specialization=5;
		obj1.department="development";
		obj1.printSalary();
		System.out.println(obj1.name+" "+
		obj1.age+" "+
		obj1.phoneNumber+" "+
		obj1.address+" "+
		obj1.salary+" "+
		obj1.specialization+" "+
		obj1.department);
		Manager obj2=new Manager();
		obj2.name="hasan";
		obj2.age=45;
		obj2.phoneNumber="456555456";
		obj2.address="timber creek road";
		obj2.salary=60000;
		obj2.specialization=3;
		obj2.department="tester";
		obj2.printSalary();
		System.out.println(obj1.name+" "+ 
				obj2.age+" "+
				obj2.phoneNumber+" "+
				obj2.address+" "+
				obj2.salary+" "+
				obj2.specialization+" "+
				obj2.department);

	}

}
class Employee extends Member{
	int specialization;
	String department;
}
class Manager extends Member{
	int specialization;
	String department;
}
