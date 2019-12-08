package com.rewiev26;

public class Ent extends Doctor {
//this is already there
//	public Ent() {
//	super();

	public Ent(String name, String speciality,int licenceId) {
		//super();//calls default constructor
		super(name,speciality,licenceId);
	/*	this.name=name;
		this.speciality=speciality;
		this.licenceId=licenceId;*/
	}
	public void chargePatient() {
		System.out.println("give me 5000$ ");
	}
}
