package com.class37;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HighSalary {
	public static void main(String[] args) {
		Map<String,Integer> employee=new TreeMap<>();
		employee.put("zeynep", 5000);
		employee.put("hasan", 4000);
		employee.put("ali", 9000);
		employee.put("ayse", 10000);
int max=0;
Collection<Integer> sal=employee.values();
for(Integer i:sal) {
	if(i>=max) {
	max=i;	
		
	}
	
}
	Set<String> key=employee.keySet();
	for(String keys:key) {
		if(employee.get(keys)==max) {
			System.out.println(keys+"=$"+max);
		}
	}
	}
	
	
	
}
