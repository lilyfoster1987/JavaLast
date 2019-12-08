package com.class27;

public class RunTime {

	public static void main(String[] args) {
	
		//non primitive typecasting
		//widening >>>creating an object of the class
		//and giving reference to the Parent class
		Animal obj=new Cat();
	//Cat obj2=new Animal();
	//cant narroving 
		obj.eat();
		obj.sleep();
		//obj.meov();
		//***************
		Animal obj1=new Animal();
		obj1.eat();
		obj1.sleep();
		//****************
		Cat cat=new Cat();
		cat.eat();
		cat.sleep();
		cat.meov();
		
				
	}

}
