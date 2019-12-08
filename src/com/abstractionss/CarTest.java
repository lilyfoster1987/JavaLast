package com.abstractionss;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sedan car=new Sedan();
car.carPrice=80000;
car.length=20;
System.out.println(car.calculateSalePrice());
System.out.println("********************");
Truck truck=new Truck();
truck.carPrice=20000;
truck.weight=2000;
System.out.println(truck.calculateSalePrice());
	}

}
