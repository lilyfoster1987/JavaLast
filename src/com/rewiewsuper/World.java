package com.rewiewsuper;

public class World {
public static void main(String[] args) {
	Human person1 = new Human("Andrei");
	Human person2 = new Human("Salim", 25, 150);
	
	System.out.println("---America---");
	Human person3 = new American("John", 42, 250, "111-22-333");
	
	System.out.println("---Albania---");
	Human person4 = new Albanian();
	
	System.out.println();
	System.out.println("The world ended!!!");
	Human person5=new Turkish("zeynep",36,150,"Turkish");
	person5.greeting();
	person5.talk();
	
	Turkish person6=new Turkish("ali",30,150,"Turkish");
	person6.greeting();
	person6.talk();
	person6.likeKebab();
}
}
