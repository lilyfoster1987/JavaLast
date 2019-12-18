package com.collections;

interface Interf
{
	default void m1()
	{
		System.out.println("interface default method");
	}
}
 class Test implements Interf
{
	public void m1()
	{
		System.out.println("Test class method");
	}


}