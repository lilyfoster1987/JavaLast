package com.rewiev26;

public class Doctor {
public String name;
public String speciality;
public int licenceId;
public String  adress;
public String dayOff;
public Doctor(String name,String speciality,int licenceId,String  adress,String dayOff) {
	this(name,speciality,licenceId);
	/*this.name=name;
	this.speciality=speciality;
	this.licenceId=licenceId;*/
	this.adress=adress;
	this.dayOff=dayOff;
	this.treatPatient();//this method in this class
	chargePatient();
	
}
public Doctor() {
	
}
public Doctor(String name, String speciality,int licenceId) {
	
	this.name=name;
	this.speciality=speciality;
	this.licenceId=licenceId;
}
public void treatPatient() {
	System.out.println("Gives a prescription");
}
public void checkUp(String name) {
	System.out.println("Doctor "+this.name+" make a lot blood tests for "+name);
}
public void chargePatient() {
	System.out.println("give me 1000$ ");
}
public void displayInfo() {
	System.out.println("Doctor "+ name+" with licence id: "+licenceId+" is a "+speciality);
}
}
