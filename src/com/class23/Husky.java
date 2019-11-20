package com.class23;

public class Husky {

	static String breed="Husky";
	static int paws=4;
	static int tale=1;
	
	String name;
	String color;
	void display() {
		
		System.out.println("puppy name is "+name+" and it is breed is "+breed);
	}
	public static void main(String[] args) {

Husky h1=new Husky();
h1.name="Meatball";
h1.color="brown";
System.out.println(h1.breed);
h1.display();
Husky h2=new Husky();
h2.name="Sharik";
h2.color="Black";
h2.display();
Husky h3=new Husky();
h3.name="Jack";
h3.color="white";
h3.breed="Bulldog";
h3.display();
h1.display();
h2.display();

h2.display();
	}

}
