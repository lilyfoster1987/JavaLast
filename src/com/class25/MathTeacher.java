package com.class25;

public class MathTeacher extends Teacher{
	int salary;
MathTeacher(String name, String lastname, char gender, String branch) {
		super(name, lastname, gender, branch);
			}

public void calculate() {
	System.out.println(name+" "+lastname+" can play calculate");
}
}
