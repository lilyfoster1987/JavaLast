package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetrieweAllValues {
public static void main(String[] args) {
	Map<String,String> name=new HashMap<>();
	name.put("zeyenp","Celik");
	name.put("Hasan","Yildiz");
	name.put("Eda","kol");
	name.put("Ozlem","yildiz");
	System.out.println("*****enchanced loop**********");
	Collection<String> val=name.values();
	for(String vall:val) {
		System.out.println(vall);
		
	}
	System.out.println("*****iterator*************");
	Iterator<String> it=val.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("***Key******");
	Set<String> key=name.keySet();
	for(String k:key) {
		System.out.println(k);
	}
	System.out.println("*********key iterator*********");
	Iterator<String> it1=key.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	Set<Entry<String,String>> entry=name.entrySet();
	for(Entry<String,String> en:entry) {
	System.out.println(en.getKey()+":"+en.getValue());	
	}
}
}
