package com.rewiev26;

public class Dermatologist extends Doctor{
public Dermatologist(String name, String speciality,int licenceId) {
	this.name=name;
	this.speciality=speciality;
	this.licenceId=licenceId;
}
	public void skinTreat() {
		
	}
	public void chargePatient() {
		System.out.println("give me 2000$ ");
	}
	public void checkUp(String name) {
		System.out.println("Doctor "+this.name+" make a lot alergy  tests"+name);
	}
}
