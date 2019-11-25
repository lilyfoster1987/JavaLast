package com.rewiev22;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car1=new Car();
car1.display();
car1.make="toyota";
car1.color="green";
car1.display();


Car car2=new Car("reno","black");
car2.display();



	}

}
