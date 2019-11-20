package com.class23;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVsNonStatic.getInfo1();
		System.out.println(StaticVsNonStatic.school);
		
		
		//how to acces non static variables 
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		
		obj.name="john";
		obj.grade='A';
		obj.getinfo();
	}

}
