package com.class34;
import java.util.ArrayList;
class Main{
	public static void main(String[] args) {
		
	
	ArrayList<Integer> listA=new ArrayList<>();
	   
	   listA.add(0);
	   listA.add(1);
	   listA.add(2);
	   listA.add(3);
	   listA.add(4);
	   listA.add(5);
	   ArrayList<Integer> listB=new ArrayList<>();
	   for(int i=0; i<listA.size();i++){
	     listB.add(listA.get(i));
	     for(int j=0; j<1;j++){
		     listB.add(listA.get(i));
	   }
	   }
	   System.out.println(listB);
	  
	   
	 
	  
	  }}