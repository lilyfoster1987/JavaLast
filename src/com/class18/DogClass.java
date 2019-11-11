package com.class18;

public class DogClass {
	String name;
	  void bark(){
	    
	    System.out.println(name+" can bark");
	  }
	  void run(){
	    
	    System.out.println(name+ " can run");
	  }
	  void play(){
	    
	    System.out.println(name+ " can play");
	  }
	  
	  
	  public static void main(String [] args){
	    
	    DogClass  dog1=new DogClass();
	    dog1.name="Husky";
	    dog1.run();
	    dog1.bark();
	    dog1.play();
	    
	   DogClass  dog2=new DogClass();
	   dog2.name="Bulldog";
	    dog2.run();
	    dog2.bark();
	    dog2.play();
	  DogClass  dog3=new DogClass();
	  dog3.name="Labrador";
	    dog3.run();
	    dog3.bark();
	    dog3.play();
	    
	  }
	
}
