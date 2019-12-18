package com.class35;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*Create a Set collection in which you need to add names of the countries. 
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.*/
public class Country {
public static void main(String[] args) {
	TreeSet<String> tset=new TreeSet<>();

	tset.add("Turkey");
	tset.add("Usa");
	tset.add("German");
	tset.add("Canada");
	tset.add("France");
	System.out.println("*************First way*******");
	for(String s:tset) {
		System.out.println(s);
	}
	System.out.println("**********Second way***********");
	Iterator<String> it=tset.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
}
}
