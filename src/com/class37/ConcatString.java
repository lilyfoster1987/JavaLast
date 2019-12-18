package com.class37;
//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.

import java.util.HashSet;
import java.util.Set;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> str=new HashSet<>();
str.add("zeynep");
str.add("Hasan");
str.add("Hasan");
str.add("Ayse");
str.add("Mehmet");
String sum="";
for(String s:str) {
	sum=sum+s;
}
System.out.println(sum);
	}

}
