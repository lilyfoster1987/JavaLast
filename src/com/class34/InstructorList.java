package com.class34;

import java.util.ArrayList;
import java.util.Iterator;

public class InstructorList {
public static void main(String[] args) {
	ArrayList<Instructor> arr=new ArrayList<>();
	arr.add(new Instructor("asel","umurzakova"));
	arr.add(new Instructor("diego","juarez"));
	arr.add(new Instructor("Muhammed","shokiryan"));
	arr.add(new Instructor("wegas","hag"));
	arr.add(new Instructor("sohil","kk"));
	
	Iterator<Instructor> it=arr.iterator();
	while(it.hasNext()) {
		it.next().display();
	}
	System.out.println("**********second way***********");
	for(Instructor i:arr) {
		System.out.println(i.name);
		System.out.println(i.lastName);
		i.display();
		
		
	}
	
}
}
