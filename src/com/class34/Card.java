package com.class34;
/*Create a Card class that will have implemented and unimplemented 
methods and a constructor that  will  initializes  credit  card  type.    
Create  3 subclasses  of  a  Card  card.  Create  3  objects  of different 
card  and  store  them  into  LinkedList. Using  for  loop/advanced  for 
loop/  iterator
access all methods of the class.*/
public abstract class Card {
String cardNumber;
double salary;
public Card(String cardNumber,double salary) {
	this.cardNumber=cardNumber;
	this.salary=salary;
}
public abstract void creditLimit();
	

public  void increaseLimit() {
	System.out.println("you can increase your credit limit");
}
}
class MasterCard extends Card{

	public MasterCard(String cardNumber,double salary) {
		super(cardNumber, salary);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseLimit() {
		if(salary>10000) {
			System.out.println("you  can increase your limit as %20 more...");
		}
		else {
			System.out.println("you  can increase your limit as %10 more...");
		}
	}

	@Override
	public void creditLimit() {
		if(salary<10000) {
			System.out.println("Your credit limit is $5000");
		}else {
			System.out.println("Your credit limit is $8000");
		}
		
	}
	
}
class Visa extends Card{

	public Visa(String cardNumber,double salary) {
		super(cardNumber, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseLimit() {
		if(salary>10000) {
			System.out.println("you  can increase your limit as %30 more...");
		}
		else {
			System.out.println("you  can increase your limit as %15 more...");
		}
		
	}

	@Override
	public void creditLimit() {
		if(salary<15000) {
			System.out.println("Your credit limit is $6000");
		}else {
			System.out.println("Your credit limit is $10000");
		}
	}
	
}
class GoldCard extends Card{

	public GoldCard(String cardNumber, double salary) {
		super(cardNumber, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseLimit() {
		if(salary>80000) {
			System.out.println("you  can increase your limit as %10 more...");
		}
		else {
			System.out.println("you  can increase your limit as %5 more...");
		}
	}

	@Override
	public void creditLimit() {
		if(salary<5000) {
			System.out.println("Your credit limit is $1000");
		}else {
			System.out.println("Your credit limit is $4000");
		}
		
	}
	
}
