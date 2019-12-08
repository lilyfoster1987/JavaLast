package com.class32;

public class Account {
private long accountNumber;
private double balance;
public long getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(long accountNumber) {
	if(String.valueOf(accountNumber).length()==9) {
		this.accountNumber=accountNumber;}
}
public double getBalnce() {
	return balance;
}
public void setBalance(int amount) {
	if(amount>0) {
	balance=balance+amount;
	}
	//getter gives only read access
	//setter gives only write access
}
}
