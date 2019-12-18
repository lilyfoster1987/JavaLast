package com.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Object {
	String name;
	double price;
	int quantity;
	public Object(String name) {
		this.name=name;
	}
	public Object(double price) {
		this.price=price;
	}
	public Object(int quantity) {
		this.quantity=quantity;
	}
	
	public static void main(String[] args) {
		
	
	 List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
		HashMap<String, Object>  appleMap= new HashMap<>();
		
	   appleMap.put("Items",new Object("Apple"));
	   appleMap.put("Price", new Object(20.00));
	   appleMap.put("Quantity", new Object(10));
	   dataList.add(appleMap);
	   HashMap<String, Object>  orangeMap= new HashMap<>();
		
	   orangeMap.put("Items", new Object("Orange"));
	   orangeMap.put("Price", new Object(21.99));
	   orangeMap.put("Quantity", new Object(10));
	   dataList.add(orangeMap);
	   
	   double subPrice=0;
	   double purchase=0;
	
	  
	   for(Map<String, Object> s:dataList) {
		String item=s.get("Items").name;
		double price=s.get("Price").price;
		int quantity=s.get("Quantity").quantity;
		subPrice=price*quantity;
		System.out.println("Items: "+item+ " Price: "+price+" Quantity: "+quantity+" SubTotal: "+subPrice);
	  purchase=purchase+subPrice;
	   }
	   System.out.println("Your Purchase total :"+purchase);
	   

}}
