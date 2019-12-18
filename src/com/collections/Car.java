package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
//Create an arraylist of cars and retrieve all the values using 4 different ways.


public class Car {

	public static void main(String[] args) {
		ArrayList<String> car=new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		System.out.println("***********first way************");
		for (String cars : car) {
			System.out.println(cars);
		}
		System.out.println("******************Second way*********");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
		System.out.println("******************third way************");
		int i=0;
		while(i<car.size()) {
			System.out.println(car.get(i));
			i++;
		}
		System.out.println("********************fourth way**********");
		Iterator it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
