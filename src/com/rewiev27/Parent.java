package com.rewiev27;

class Parent
{
	public void m1()
	{
		System.out.println("Parent Method");
	}
	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.m1();
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("Child Method");
	}
}


	

