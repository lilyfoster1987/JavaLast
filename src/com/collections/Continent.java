package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Continent {

	public static List<String> asiaCountry(){
		List<String> asia=new ArrayList<>();
	asia.add("Japan");
	asia.add("India");
	asia.add("China");
	asia.add("Iran");
	asia.add("Phlipine");
	asia.add("South Korea");
	
		return asia;
	}

public static List<String> europeCountry(){
	List<String> europe=new ArrayList<>();
	europe.add("Turkey");
	europe.add("Belgium");
	europe.add("Greece");
	europe.add("German");
	europe.add("Holland");
	europe.add("France");
	
	return europe;
}
public static List<String> americaCountry(){
	List<String> america=new ArrayList<>();
	america.add("Mexico");
	america.add("Brazil");
	america.add("Canada");
	america.add("Chile");
	america.add("Argentina");
	america.add("Usa");
	
return america;
}
public static List<String> africaCountry(){
	List<String> africa=new ArrayList<>();
	africa.add("Kenya");
	africa.add("Nigeria");
	africa.add("Moroco");
	africa.add("Senegal");
	africa.add("Uganda");
	return africa;
	
}
public static void main(String[] args) {
	List<List<String>> world=new ArrayList<>();
	world.add(asiaCountry());
	world.add(europeCountry());
	world.add(africaCountry());
	world.add(americaCountry());
	System.out.println("*********Enhanced loop**********");
	for(List<String> country:world) {
		System.out.println(country);
	}
	System.out.println("***********Iterator********");
	Iterator<List<String>> it=world.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}

}
