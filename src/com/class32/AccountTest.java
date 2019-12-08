package com.class32;

public class AccountTest {
public static void main(String[] args) {
	Account acc=new Account();
	//if it is private you can not acces
	//acc.accountNumber=4561231;
	//acc.balance=1000;
	acc.setAccountNumber(12345687);
	long accountNum=acc.getAccountNumber();
	acc.setBalance(10000);
	double myBalance=acc.getBalnce();
	System.out.println(myBalance);
	
	int num=123;
	String.valueOf(num);
}}
