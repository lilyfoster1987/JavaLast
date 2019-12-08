package com.subclasses1;

class Main {
public static void main(String [] args){
  Child o=new Child("name");
}
   
}
class Child extends Parent{
	  
	  Child(String name){
		  super(name);
	     System.out.println("Child class Constructor without parameter"+name);
	  }
	}
class Parent{
	  
	  Parent(String name){
	    
	    System.out.println("Parent class Constructor without parameter"+name);
	  }
	}