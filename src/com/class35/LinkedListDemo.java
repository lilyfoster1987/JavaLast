package com.class35;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String >llist=new LinkedList<>();
	//adding elements
	llist.add("hello");
	llist.add("bye");
	llist.add("hello");
	llist.add("bye");
	System.out.println(llist);
	llist.add(2,"how are you");
	System.out.println(llist);
	llist.set(1,"good bye");
	System.out.println(llist);
	//retrieve 1 element
	String element=llist.get(2);
	System.out.println(element);
	//retrieve all elements
	for (int i = 0; i < llist.size(); i++) {
		
		System.out.println(llist.get(i));
		
	}
	
	//second way
	for(String i:llist) {
		System.out.println(i);
	}
	//third way
	Iterator<String> it=llist.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
			
}
}
