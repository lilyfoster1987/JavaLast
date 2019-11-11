package com.class18;



public class Main {
	String carColor, carName;
	int carModelYear;
	public static void main(String [] args){
	  
	Main car1=new Main();
	car1.carColor="Black";
	car1.carName="BMW";
	car1.carModelYear=2019;
	System.out.println("Car color is "+car1.carColor+ " and car model  year is "+ car1.carModelYear+" car name is "+car1.carName);
	Main car2=new Main();
	car2.carModelYear=2018;
	car2.carName="Toyota";
	car2.carColor="White";
	System.out.println("Car color is "+car2.carColor+ " and car model  year is "+ car2.carModelYear+" car name is "+car2.carName);
	}
}
