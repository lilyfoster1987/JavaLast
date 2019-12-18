package com.class35;

import java.util.ArrayList;
import java.util.HashSet;

/*How  can  you  remove  all  duplicates  from ArrayList?List<String> aList=new 
ArrayList<>();*/
public class RemoveDublicate {

	public static void main(String[] args) {
		ArrayList<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		System.out.println(aList);
		HashSet<String> hset=new HashSet<>(aList);
		System.out.println(hset);

	}

}
