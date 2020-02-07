package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Den2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Map<String, Object>> list=new ArrayList<>();
		
		Map<String, Object> mapCats=new HashMap<>();
		mapCats.put("Names", "kitty");
		mapCats.put("Ages", 5);
		mapCats.put("Color", "Black");
		list.add(mapCats);
	
		Map<String, Object> mapDogs=new HashMap<>();
		mapDogs.put("Names", "puppy");
		mapDogs.put("Ages", 6);
		mapDogs.put("Color", "white");
		list.add(mapDogs);
		
		System.out.println(list);//burada neden sadece dog yazdiryo ve cat null gorunuyo?
		String name;
		String color;
		int age;
		for(Map<String,Object> s:list) {
			 age=(int)s.get("Ages");
			name=s.get("Names").toString();
			 color=s.get("Color").toString();
			if(name.equals("kitty")) {
				System.out.println(name+" is "+age+" years old");
			}
		}
		Set<String> key=mapCats.keySet();
		for(String s:key) {
			System.out.println(s+":"+mapCats.get(s));
		}
		Collection<Object> val=mapCats.values();
		
		Iterator<Object> it=val.iterator();
		
		
	}

}
