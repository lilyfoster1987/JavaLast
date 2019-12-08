package com.class4;

public class Parent {
	 String city;
	   public  Parent(String city){
	      this.city=city;
	       }
	       
	       public void display(){
	         System.out.println("City name "+this.city);
	       }
	       public static void main(String[] args){
	    	    Child obj=new Child("Fairfax");
	    	    obj.display();
	    	  }
	  }
	  class Child extends Parent{
	    
	  public  Child (String city){
	      super(city);
	    }
	  }

