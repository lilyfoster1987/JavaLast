package com.class36;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class BestBuy {
private static final int HashMap = 0;

public static void main(String[] args) {
	HashMap<Integer,String> bestBuy=new HashMap<>();
	bestBuy.put(123456,"Refrigirator");
	bestBuy.put(144556,"Oven");
	bestBuy.put(199996,"iphone 10");
	bestBuy.put(198745,"Ipad");
	Set<Entry<Integer,String>> ent=bestBuy.entrySet();
	System.out.println("**************Enchanced loop*********");
	for(Entry<Integer,String> entry:ent) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	System.out.println("****************iterator***********");
	Iterator<Entry<Integer,String>> it=ent.iterator();
	while(it.hasNext()) {
		Entry<Integer,String> val=it.next();
		System.out.println(val.getKey()+":"+val.getValue());
	}
	
}
}
