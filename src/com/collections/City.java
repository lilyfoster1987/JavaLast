package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*Create an HashSet of cities and add duplicates into it. 
● Retrieve all values from hashset in 2 different ways. ● 
Retrieve all values in alphabetical order.*/

public class City {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("Dallas");
	hset.add("San Francisco");
	hset.add("New York");
	hset.add("Washington");
	hset.add("Dallas");
	hset.add("Washington");
	System.out.println("*****advanced loop**********");
	for(String s:hset) {
		System.out.println(s);
		
	}
	System.out.println("********iterator**************");
	Iterator<String> it=hset.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("************TreeSet***********");
	TreeSet<String> tset=new TreeSet<>(hset);
	for(String tree:tset) {
		System.out.println(tree);
	}
	
}
}
