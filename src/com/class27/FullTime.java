package com.class27;

public class FullTime extends Employee {
	public int bonus;
	void getPaid() {//overriding
		System.out.println("Full time Employee gets paid "+salary+" and bonus "+bonus);
	}
}
