package com.abstractionss;
/*Create 2 sub classes: Sedan and Truck. The Truck class 
 * has ﬁeld as weight and has its own implementation of 
 *  calculateSalePrice() method in which returned price 
 *  calculated as following: if weight>2000 then returned 
 *  price car should include 10% discount, otherwise 20% discount. 
 *  The Sedan class has ﬁeld as length and also does it is own 
 *  implementation of calculateSalePrice(): if length of sedan is >20
 *   feet then returned car price should include 5% discount, otherwise 
 *   10% discount
*/
public  abstract class Car {
double carPrice;
String color;
public abstract  double calculateSalePrice() ;
}

class Sedan extends Car{

	double length;
	@Override
	public double calculateSalePrice() {
		// TODO Auto-generated method stub
		double SedanPrice;
		if(length>20) {
			SedanPrice=carPrice-(carPrice*0.05);
		}
		else {
			SedanPrice=carPrice-(carPrice*0.10);
		}
		return SedanPrice;
	}
}
class Truck extends Car{
	double weight;
	
	
		@Override
		public double calculateSalePrice() {
			double truckPrice;
			if(weight>2000) {
				truckPrice=carPrice-(carPrice*0.10);
			}
			else {
				truckPrice=carPrice-(carPrice*0.20);
			}
			return truckPrice;
		}
	
}
