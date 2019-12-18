package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Countries {
public static void main(String[] args) {
	TreeMap<String, String> country=new TreeMap<>();
	country.put("Turkey", "Ankara");
	country.put("USA", "Washington");
	country.put("England", "Londra");
	country.put("Belgium", "Brussels");
	Set<String> keys=country.keySet();
	System.out.println("**********for loop entry************");
	for(String s:keys) {
		System.out.println(s+":"+country.get(s));
	}
	System.out.println("***********iterator entry***********");
	Iterator<String> it=keys.iterator();
	while(it.hasNext()) {
		String str=it.next();
		System.out.println(str+":"+country.get(str));
	}
System.out.println("*********for loop key********");
	for(String str:keys) {
		System.out.println(str);
	}
	Collection<String> val=country.values();
	System.out.println("*****loop value***********");
	for(String s1:val) {
		System.out.println(s1);
	}
	System.out.println("*****iterator value***********");
	
	Iterator<String> it1=val.iterator();
	while(it1.hasNext()) {
		String value=it1.next();
		System.out.println(value);
	}
	
Set<Entry<String,String>> ent=country.entrySet();
for(Entry<String,String> i:ent) {
	System.out.println(i.getKey()+":"+i.getValue());
}
Iterator<Entry<String,String>> it2=ent.iterator();
while(it.hasNext()) {
	Entry<String,String> it11=it2.next();
	
System.out.println(it11.getKey()+":"+it11.getValue());


	
}
	
}
}
