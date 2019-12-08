package com.class31;

public class BankTest {
public static void main(String[] args) {
	CapitalOneChild obj=new CapitalOneChild();
	obj.trust();
	obj.haveChecking();
	obj.haveSavings();
	obj.financing();
	System.out.println("******************");
	CapitalOne co=new CapitalOne();
	co.haveChecking();
	co.haveSavings();
	co.trust();
	co.financing();
}
}
