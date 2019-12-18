package com.class35;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*Create a Set of cities in which you want to make sure that insertion order
is maintained. Using Iterator remove any 
city that starts with “A”;*/
public class City {
public static void main(String[] args) {
	LinkedHashSet<String> lset=new LinkedHashSet<>();
	lset.add("Dallas");
	lset.add("San Francisco");
	lset.add("New York");
	lset.add("Washington");
	lset.add("Ankara");
	lset.add("Washington");
	lset.add("Adana");
	System.out.println(lset);
	
	Iterator<String> it=lset.iterator();
	while(it.hasNext()) {
		String city=it.next();
		if(city.startsWith("A")) {
			it.remove();
		}
		
	}
	System.out.println(lset);
}
}
