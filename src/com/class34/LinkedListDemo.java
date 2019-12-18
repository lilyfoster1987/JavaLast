package com.class34;

import java.util.HashSet;
import java.util.Iterator;



public class LinkedListDemo {

	public static void main(String [] args){
		HashSet<String> hset = new HashSet<String>();
		  hset.add("first");
		  hset.add("second");
		  hset.add("third");
		  hset.add("fourth");
		  hset.add("fifth");
		  
		 String[] arr=new String[hset.size()];
		 Iterator<String> it = hset.iterator();  
		 while(it.hasNext()){      
			 for (int i = 0; i < arr.length; i++) {
				arr[i]=it.next(); 
			}
			
		 }
			 
		 System.out.println("Array elements:");
		 for(String a:arr){
		   System.out.println(a);
		 }
		 
		   
		   

		  
		 
		 

		}
		 
		}