package com.abstractionss;
/*Create an abstract class 'Animals' with two abstract methods 
'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' 
which prints "Cats meow" and a class 'Dogs' with a method 'dogs' 
which prints "Dogs bark", both inheriting the class 'Animals'. 
Now create an object for each of the subclasses 
and call their respective methods.*/
public abstract class Animals {
public abstract void cats();
public abstract void dogs();
}
 class Cats extends Animals{

	@Override
	public void cats() {
		System.out.println("Cats meaw");
		
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}


	
}
 class Dog extends Animals{

	@Override
	public void cats() {
		
		
	}

	@Override
	public void dogs() {
		System.out.println("Dogs bark");
		
	}
	 
 }