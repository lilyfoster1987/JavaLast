package com.collections;

import java.util.ArrayList;

//can we calculate how many times each word is repeated in a String
//by using collections and print them in alphabetical order.
public class Stringdem {
public static void main(String[] args) {
	String str="Today is rewiev day and today topic is exception";
	
	String[] arr1=str.toLowerCase().split(" ");

	
	String str1="";
	
	for(int i=0; i<arr1.length; i++) {
		boolean b=false;
		for(int j=0; j<arr1.length; j++) {
			if(arr1[i].equals(arr1[j])) {
				b=true;
				break;

			}
			if(!b) {
				str1=str1.concat(arr1[i]+ " ");
			}
			}
	}
	
	String[]arr2=str1.split(" ");
	for (int  i= 0;  i< arr2.length; i++) {
		int count=0;
		for (int j = 0; j < arr2.length; j++) {
			if(arr2[i].equals(arr2[j])) {
				count=count+1;
			}
		}
		System.out.println(arr2[i] +" is repeated " + count + " times.");
	}
}
}
