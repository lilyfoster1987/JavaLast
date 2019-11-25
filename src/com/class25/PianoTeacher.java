package com.class25;

public class PianoTeacher extends Teacher {
	String subBranch;                      

	PianoTeacher(String name, String lastname, char gender, String branch) {
		super(name, lastname, gender, branch);
		// TODO Auto-generated constructor stub
	}

	public void play() {
		
			System.out.println(name+" "+lastname+" can play piano");

		
	
}}
