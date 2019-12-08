package com.class27;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.salary=8000;
		emp.getPaid();
		FullTime emp1=new FullTime();
		 emp1.salary=90000;
		 emp1.bonus=10000;
		 emp1.getPaid();
	}

}
