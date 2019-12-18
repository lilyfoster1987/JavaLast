package com.class37;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*Create a Map that will store Employee name and salary. 
Write a logic to retrieve an employee who gets the highest salary. 
Output should be in the below format
John Smith=$100000*/
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> employee=new TreeMap<>();
employee.put("zeynep", 5000);
employee.put("hasan", 4000);
employee.put("ali", 9000);
employee.put("ayse", 10000);
Set<Entry<String,Integer>> ent=employee.entrySet();
int high=Collections.max(employee.values());
System.out.println(high);
for(Entry<String,Integer> get:ent) {
	
	if(high==get.getValue())
	
		
		System.out.println(get.getKey()+":"+get.getValue());
	
	}
	
}


	

}
