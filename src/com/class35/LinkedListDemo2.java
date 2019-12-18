package com.class35;

import java.util.LinkedList;

public class LinkedListDemo2{
	public static void main(String[] args) {
		LinkedList<Sweets> sweet=new LinkedList<>();
		sweet.add(new Sweets("chocolate"));
		sweet.add(new Sweets("cake"));
		sweet.add(new Sweets("cookie"));
		sweet.add(new Sweets("macarons"));
		//lets display name of each sweet object
		
		for(Sweets element:sweet) {
		System.out.println(element.name);
		element.ilove();
		//retrieving 1 elemnt andd accesing method  2 steps
		Sweets mysweet=sweet.get(2);
		mysweet.ilove();
		
		String nameofsweet=sweet.get(1).name;
		System.out.println(nameofsweet);
		
		String str="hello 123";
		str.replace("123", "456").trim();
		Integer num=100;
	int newNum=num.toString().replace("100", "200").length();
	System.out.println(newNum);
				
	}
}}