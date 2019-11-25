package com.class23;

public class Car {
	String make;
	String model;
	int numberOfDoors;
	int  topSpeed;
	double price;
	Car(String make1,String model1,int numberOfDoors1,int  topSpeed1,double price1){
	 make=make1;
	 model=model1;
	numberOfDoors=numberOfDoors1;
	 topSpeed=topSpeed1;
	 price=price1;
	}
	Car(String make1,String model1,int  topSpeed1,double price1){
	 make=make1;
	 model=model1;
	 topSpeed=topSpeed1;
	 price=price1;

	}
	Car(int numberOfDoors1,int  topSpeed1,double price1){

	numberOfDoors=numberOfDoors1;
	 topSpeed=topSpeed1;
	 price=price1;

	}
	Car(String make1,String model1,int numberOfDoors1){
	 make=make1;
	 model=model1;
	numberOfDoors=numberOfDoors1;
	 

	}
	public void display(){
	  System.out.println(make+ " "+model+" "+numberOfDoors+ " "  +topSpeed+" "+price);
	  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Toyota", "Prius",4,120,30000.0);
		  c1.display();
			
	}

}
