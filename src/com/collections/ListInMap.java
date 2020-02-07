package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListInMap{
public static void main(String[] args) {
		
	    List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
		HashMap<String, Object>  appleMap= new HashMap<>();
		
	   appleMap.put("Items","Apple");
	   appleMap.put("Price", 20.00);
	   appleMap.put("Quantity", 10);
	   dataList.add(appleMap);
	   HashMap<String, Object>  orangeMap= new HashMap<>();
		
	   orangeMap.put("Items", "Orange");
	   orangeMap.put("Price", 21.99);
	   orangeMap.put("Quantity", 10);
	   dataList.add(orangeMap);
	   
	   double subPrice=0;
	   double purchase=0;
	   double price;
	  double quantity;
	   for(Map<String, Object> s:dataList) {
		String items=s.get("Items").toString();
		 price=(double)s.get("Price");
		 quantity=(int)s.get("Quantity");
		subPrice=price*quantity;
		System.out.println("Items: "+items+ " Price: "+price+" Quantity: "+quantity+" SubTotal: "+subPrice);
		purchase=purchase+subPrice;
	   }
  
  System.out.println("Your Purchase total :"+purchase);
}
}
