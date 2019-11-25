package com.class24;

public class StoreProduct {

	String label;
	double  price ;
	String  category;
	boolean hasExpiration ;
	int stock ;

	StoreProduct(String label1,double  price1 ,String  category1,boolean hasExpiration1 ,int stock1 ){
	   label=label1;
	 price =price1;
	 category=category1;
	hasExpiration =hasExpiration1;
	stock=stock1;
	  
	  
	}
	StoreProduct(String label1,double  price1 ,int stock1 ){
	  label=label1;
	 price =price1;
	 category="misc";
	hasExpiration =false;
	stock=stock1;
	  
	  
	}
	StoreProduct(String label1,
	double  price1 ){
	  
	  label=label1;
	 price =price1;

	stock=0;
	}
	public void display(){
	  
	  System.out.println(label+" "+ price +" "+category+" "+ hasExpiration +" "+stock );
	  
	}
	public static void main(String[] args) {
		
		StoreProduct obj1=new StoreProduct("Eggs",3.0,"Produce",true,10);
		obj1.display();
		StoreProduct obj2=new StoreProduct("Paper Towels",2.0,24);
		obj2.display();
		StoreProduct obj3=new StoreProduct("Paper Towels",0);
		obj3.display();
		
	}
	  
	}