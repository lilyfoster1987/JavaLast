package com.class37;
import java.util.LinkedList;

class Main
{
	public static LinkedList<String> test()
	{
		LinkedList<String> names = new LinkedList<String>();

		names.add("John");
		names.add("Brian");
		names.add("Ryan");

		return names;
	}
	public static void main(String[] args){

   LinkedList<String> arr= test();
   for (String values : arr){
     System.out.println(values);
   }
   
 }}

