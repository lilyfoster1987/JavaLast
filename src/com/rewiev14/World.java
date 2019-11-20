package com.rewiev14;

public class World {
	
	public static void main(String [] args) {
		
		
		Baby baby1=new Baby();
		baby1.firstName="John";
		baby1.lastName="Doe";
		baby1.weight=5;
		baby1.gender='m';
		baby1.hairColor="Yellow";
		System.out.println(baby1.firstName);
		baby1.walk(5);
		
		Baby baby2=new Baby();
		baby2.firstName="jane";
		baby2.lastName="Doe";
		baby2.weight=2;
		baby2.gender='f';
		baby2.hairColor="Yellow";
		baby2.walk(2);
		baby2.cry();
		baby2.displayBabyInfo();
	}

}
