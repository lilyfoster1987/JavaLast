package com.class34;
/*Create  a  class  Insurance  that  will  have  an attribute as insuranceName and 
unimplemented behaviour  as  getQuote  and  cancelInsurance. Create 3 subclasses Car, 
Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType 
attribute.  Create  3  objects  of  the  sub classes  and  store  them  in  ArrayList. 
Using  for loop/advanced  for  loop/  iterator  access  all methods of the class.*/


abstract class Insurance {
String insuranceName;
public Insurance(String insuranceName) {
	this.insuranceName=insuranceName;
}
public abstract  void getQuote();
public abstract void cancelInsurance();
}

class Car extends  Insurance{
String carModel;
public Car(String insuranceName, String carModel) {
	super(insuranceName);
	this.carModel=carModel;}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" can get quote for  "+carModel);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("you can cancel from "+insuranceName);
		
	}
	
}
class Pet extends  Insurance{
String petType;
public Pet(String insuranceName, String petType) {
	super(insuranceName);
	this.petType=petType;
}
	public void getQuote() {
		int quote=0;
		if(petType.equals("Cat")) {
			quote=500;
		}else if(petType.equalsIgnoreCase("Dog")) {
			quote=750;
		}else if(petType.equalsIgnoreCase("Bird")) {
			quote=400;
			
		}else {
			quote=250;
		}
		System.out.println("you can pay "+quote+" for your "+petType);
	}

	@Override
	public void cancelInsurance() {
		
		System.out.println("you can cancel from your plan anytime");
		
	}
	
}
class Health extends  Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("you can get quote...");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("you can cancel the health insurance in anytime...");
		
	}
	
}