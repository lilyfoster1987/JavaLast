package com.class24;

public class Dog {
	public  String dogName;
	  public static String dogBreed="Mutt";
	  public double dogWeight;
	  public Dog(String dName, String dBreed,double dWeight){
	    dogName=dName;
	    dogBreed=dBreed;
	    dogWeight=dWeight;
	  }
	  
	  public Dog(String dName,double dWeight){
	     dogName=dName;
	    dogWeight=dWeight;
	  }
	  public void display(){
	    
	    System.out.println( dogName+" "+ dogBreed+" "+  dogWeight);
	  }
	  
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
