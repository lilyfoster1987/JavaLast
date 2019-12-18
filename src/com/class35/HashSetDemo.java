package com.class35;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> hset=new HashSet<>();
	hset.add("cucumber");
	hset.add("onion");
	hset.add("pepper");
	hset.add("zuccini");
	hset.add("carrot");
	hset.add("cucumber");
	System.out.println(hset.size());
	System.out.println(hset);
	
	//
	Iterator<String> it=hset.iterator();
	while(it.hasNext()) {
		String it1=it.next();
		if(it1.contains("cucumber")) {
			
			System.out.println(it1);
			break;
		}
	}
}
}
