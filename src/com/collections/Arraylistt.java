package com.collections;

import java.util.ArrayList;
import java.util.Iterator;



public class Arraylistt {
public static void main(String[] args) {
	ArrayList<String> arr1=new ArrayList<>();
	arr1.add("spring");
	arr1.add("winter");
	arr1.add("summer");
	arr1.add("fall");
	System.out.println(arr1);
	System.out.println(arr1.isEmpty());
	System.out.println(arr1.contains("fall"));
	System.out.println(arr1.size());
	//first way
	System.out.println("for loop iteration");
	for (int i = 0; i < arr1.size(); i++) {
		System.out.println(arr1.get(i));
		
	}
	//second way
	System.out.println("Advance for loop");
	for(String arr:arr1) {
		System.out.println(arr);
	}
//	third way
	System.out.println("while iteration");
	int i=0;
	while(i<arr1.size()) {
		System.out.println(arr1.get(i));
		i++;
	}
	//fourth way 
	System.out.println("itrator iteration");
	Iterator<String> it=arr1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
it.remove();
	}
	


}

}
