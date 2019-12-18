package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
//Create an arrayList of words. Remove every word that ends with “e”. Use iterator

public class Words {
public static void main(String[] args) {
	ArrayList<String> arr1=new ArrayList<>();
	arr1.add("spring");
	arr1.add("winter");
	arr1.add("remove");
	arr1.add("fall");
	arr1.add("use");
	/*Iterator it=arr1.iterator();
while(it.hasNext()) {
	if(it.next().endsWith("e")) {
		it.remove();
	}
}
System.out.println(arr1);*/
// second wayy
	for (int i = 0; i < arr1.size(); i++) {
		if(arr1.get(i).endsWith("e")){
			arr1.remove(i);
			
		}
			}
	System.out.println(arr1);	
	//second way
	
	
}
}
