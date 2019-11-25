package com.class25;

public class ChemistryTeacher extends Teacher{
	String universitiy;
	
	ChemistryTeacher(String name, String lastname, char gender, String branch) {
		super(name, lastname, gender, branch);
		// TODO Auto-generated constructor stub
	}

	public void experince() {
		System.out.println(name+" "+lastname+" can experince.");
	}
}
