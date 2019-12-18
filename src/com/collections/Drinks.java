package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

public class Drinks {
public static void main(String[] args) {
	ArrayList<String> drink=new ArrayList<>();
	drink.add("water");
	drink.add("coke");
	drink.add("milk");
	drink.add("juice");
int a=drink.size();
	for (int i = 0; i <a; i++) {
		
			if(drink.get(i).contains("a") || drink.get(i).contains("e") ) {
				drink.remove(i);
				drink.add(i,"water");
				
			}
			
}
	System.out.println(drink);
	
	
	
	
}
}
