package com.class34;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.add(1);
	numbers.add(10);
	numbers.add(100);
	numbers.add(1000);System.out.println(numbers.size());
	numbers.add(10000);
	numbers.remove(3);
	System.out.println(numbers);
	int element=numbers.get(0);
	System.out.println(element);
	//1.way
	for (int i = numbers.size()-1; i>=0; i--) {
		numbers.get(i);
	}
	//second way
	for(int num:numbers) {
		System.out.println(num);
	}
	//3 way
	int i=0;
	while(i<numbers.size()) {
		System.out.println(numbers.get(i));
		i++;
	}
	ArrayList arr=new ArrayList();
	arr.add(5);
	arr.add("zeynep");
	arr.add(true);
	for(Object b:arr) {
		System.out.println(b);
	}
	for(int x=0; x<arr.size(); x++) {
		System.out.println(arr.get(x));
	}
	
	//iterator
	
	Iterator<Integer> iterator=numbers.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
	
	
}
}
