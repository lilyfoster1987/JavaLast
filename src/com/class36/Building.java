package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Building {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(0, "Yahoo");
		map.put(1, "Syntax");
		map.put(2, "Google");
		map.put(3, "Samsung");
		map.put(4, "Apple");
		map.put(5, "Yahoo");
		map.put(6, "Syntax");
		
		System.out.println("Map size "+map.size());
		System.out.println(map.replace(4, "Samsung"));
		System.out.println(map.remove(6, "Syntax"));
		System.out.println(map);
	//how to retrieve all keys and values
//first way of key print
		for(Integer key:map.keySet()) {
		System.out.println(key);
	}
		//second way
Set<Integer> keys=map.keySet();
Iterator<Integer> it=keys.iterator();
while(it.hasNext()) {
	Integer i=it.next();
	System.out.println(i+":"+map.get(i));
}
	//first way of print values
	for(String i:map.values()) {
		System.out.println(i);
	}
	//second way
	
	Collection<String> values=map.values();
	Iterator<String> it1=values.iterator();
	while(it.hasNext()) {
		System.out.println(it1.next());
	}
	
	
	
	}
}
