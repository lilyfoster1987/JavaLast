package com.rewiev26;

public class Hospital {
	public static void main(String[] args) {
		Doctor d1=new Doctor("John","Family doctor",123456);
		
		d1.displayInfo();
		d1.checkUp("zeynep");
		d1.treatPatient();
		d1.chargePatient();
Doctor d2=new Doctor("Jane","eye doctor",123456,"123 main","sunday");
		
		d2.displayInfo();
		d2.checkUp("zeynep");
		
		Dermatologist obj=new Dermatologist("zeynep","dermatology",456);
		obj.displayInfo();
		obj.chargePatient();
		obj.checkUp("hasan");
		Ent doc=new Ent("bulent","ent",121);
		doc.displayInfo();
		doc.chargePatient();
		
		//**********************
		Doctor d5=new Ent("oz","ent",22);
		
		Dermatologist d6=new Dermatologist("fdsf","fdgd",456);
		Doctor d7=d6;
		
		Doctor[] doctors=new Doctor[5];
		doctors[0]=d1;
		doctors[1]=d2;
		doctors[2]=d6;
		doctors[3]=d5;
		doctors[4]=d7;
		//first way
		for (int i = 0; i < doctors.length; i++) {
			doctors[i].displayInfo();
		}
		//second way
		System.out.println("***********************");
		for(Doctor docc:doctors) {
			doc.displayInfo();
		}
		
		
}
}
