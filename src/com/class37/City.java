package com.class37;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class City {
public static void main(String[] args) {
	Map<String, Integer> city=new TreeMap<>();
	city.put("Ankara",1);
	city.put("Washington",2);
	city.put("Paris",3);
	city.put("Brussels",4);
	city.put("Los Angelas",5);
	city.put("Dallas",6);
    Set<String> set=city.keySet();
	Iterator<String>it=set.iterator();
	while(it.hasNext()) {
		String key=it.next();
		if(key.length()>7) {
			it.remove();
		}
		
	}
	System.out.println(city);
}
}
