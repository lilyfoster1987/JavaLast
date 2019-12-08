package arryofobjects;
//Write a program to print the name, salary and date of joining of 10 employees in a company.
//Use array of objects.
public class Employee {
	String name;
	int salary;
	String date;
public Employee(String name,int salary,String date) {
	this.name=name;
	this.salary=salary;
	this.date=date;
}
public void display() {
	System.out.println("Employee name is "+name+" salary is "+salary+" and joining date is "+date);
}
public static void main(String[] args) {
	Employee e0=new Employee("hasan",5000,"25/21/2000");
	Employee e1=new Employee("zeynep",5000,"25/21/2000");
	Employee e2=new Employee("nilu",5000,"25/21/2000");
	Employee e3=new Employee("berrin",5000,"25/21/2000");
	Employee e4=new Employee("ali",5000,"25/21/2000");
	Employee [] array=new Employee[5];
	array[0]=e0;
	array[1]=e1;
	array[2]=e2;
	array[3]=e3;
	array[4]=e4;
	for (int i = 0; i < array.length; i++) {
		array[i].display();
	}
	System.out.println("***************************************");
	//second way
	for(Employee emp:array) {
		emp.display();
	}
	
}
}
