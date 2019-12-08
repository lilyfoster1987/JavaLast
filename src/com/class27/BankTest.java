package com.class27;

public class BankTest {
public static void main(String[] args) {
	Bank bank=new Bank();
	bank.money=900;
	double fee=bank.chargeFee();
	System.out.println("banke chagge fee "+fee);
	PNC pnc=new PNC();
	double feePnc=pnc.chargeFee();
	System.out.println("the charge fee is "+feePnc);
}
}
