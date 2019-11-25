package com.rewiev22;
//Create a SuperCar class.
/*It should have at least 10 
variables, like :
make, brand, year, manufacture, axle,
tireNumber,,,
//Create at least 4 Constructors 
with different number of parameters.*/
public class SuperCar {
	String make;
	String color;
	String brand;
	static int tire;
	static int door;
	boolean gps;
	boolean camera;
	String axle;
	String manufacture;
	int price;
	static int carcount;
	static int subPrice;
	public SuperCar(String carmake,String carcolor) {
make=carmake;
color=carcolor;
    
		
	}
	
	public SuperCar(int cardoor, int cartire) {
		
		door=cardoor;
		tire=cartire;
		
	}
	public SuperCar(boolean cargps,boolean carcamera) {
		
		gps=cargps;
		camera = carcamera;
		
		
	}
	public SuperCar(String caraxle,String carmanufacture,int carprice) {
	axle=caraxle;
	manufacture=carmanufacture;
	price=carprice;
	}
	public SuperCar(String carmake) {
		make=carmake;
		
	}
	public static void  display() {
		System.out.println("it has "+tire+" and "+ door+" doors");
	}
	public void display2(int isprice) {
		price=isprice;
		if(price>20000) {
			
		System.out.println("it is too expensive");}
		else {
			System.out.println("you can buy it");
		}
	}
	public void display3() {
		System.out.println(make+" is the best for you");
	}
	public void count() {
		carcount++;
		
	}
	public static void sumprice(int carprice) {
		
		subPrice+=carprice;
	}
	public static void main(String[] args) {
		SuperCar car1=new SuperCar("toyota","corolla");
		System.out.println("this car is maden by "+car1.make+" and its color is "+ car1.color);
		car1.count();
		car1.price=451236;
		SuperCar.sumprice(car1.price);
		SuperCar car2=new SuperCar(4,4);
		System.out.println("it has "+door+" door  and "+tire+" tires");
		car2.display();
		car2.display2(10000);
		car2.count();
		car2.price=40000;
        car2.sumprice(car2.price);
		SuperCar car3=new SuperCar("mercedes");
        car3.display3();
         car3.count();
         car3.price=1000;
         SuperCar.sumprice(car3.price);
         System.out.println("there are "+carcount+" car");
		System.out.println("superCar has total price is "+SuperCar.subPrice);
	}
	

}
