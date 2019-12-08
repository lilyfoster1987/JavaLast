package com.abstractionss;
/*Create an abstract class 'Bank' with an abstract method 'getBalance'.
$100, $150 and $200 are deposited in banks A, B and C respectively. 
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having 
a method named 'getBalance'. Call this method by creating an object of 
each of the three classes.*/
public abstract class Bank {
public abstract void getBalance();

}
class BankA extends Bank{

	@Override
	public void getBalance() {
		
		System.out.println("100");
	
	}
}
class BankB extends Bank{

	@Override
	public void getBalance() {
		System.out.println("150");
		
	}
	
}
class BankC extends Bank{

	@Override
	public void getBalance() {
		System.out.println("200");
	}
	
}

