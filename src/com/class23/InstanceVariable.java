package com.class23;

public class InstanceVariable {

	String name;
	String lastName;
	
	//static variables
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable h1=new InstanceVariable();
		h1.name="zeynep";
		h1.lastName="celik";
		System.out.println(InstanceVariable.brain);//first way
		System.out.println(h1.brain);//second way
		System.out.println(brain);//third way
		System.out.println(h1.eyes+" "+nose+" "+brain);
		
		
		InstanceVariable h2=new InstanceVariable();
		h2.name="hasan";
		h2.lastName="celik";
		System.out.println(h2.eyes+" "+nose+" "+brain);
		InstanceVariable h3=new InstanceVariable();
		h3.name="nili";
		h3.lastName="celik";
		System.out.println(h3.name+h3.lastName);
		System.out.println(h3.eyes+" "+nose+" "+brain);
		
	}

}
