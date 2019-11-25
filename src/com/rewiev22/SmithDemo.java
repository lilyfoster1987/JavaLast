package com.rewiev22;

public class SmithDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmithMember m1=new SmithMember();
		m1.firstName="john";
		m1.lastName="Smith";
		m1.gender='M';
		m1.salary=5000;
		m1.increment();
		m1.addIncome(m1.salary);
		SmithMember m2=new SmithMember();
		
		m2.firstName="jane";
		m2.lastName="Smith";
		m2.gender='F';
		m2.salary=6000;
		m2.increment();
	m2.addIncome(m2.salary);
		System.out.println(m2.count);
		SmithMember baby=new SmithMember();
		baby.salary=500;
		baby.firstName="mia";
		baby.increment();
		System.out.println(baby.count);
		System.out.println(SmithMember.count);
		baby.addIncome(baby.salary);
		JamesMember jm1=new JamesMember();
		jm1.firstName="lebron";
		jm1.lastName="James";
		jm1.gender='M';
		jm1.salary=10000;
		jm1.increment();
		JamesMember jm2=new JamesMember();
		jm2.firstName="nika";
		jm2.lastName="James";
		jm2.gender='f';
		jm2.salary=105000;
		jm2.increment();
		System.out.println("there are "+JamesMember.count+" people");
	System.out.println();
	}
}
