package com.class37;

import java.util.LinkedList;

//Create a collection of integers in which you can keep duplicates. 
//Write a logic to find sum of all integers



public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> num=new LinkedList<>();
num.add(25);
num.add(20);
num.add(2);
num.add(2);
num.add(2);
num.add(24);
num.add(11);
num.add(2);
int sum=0;
for(Integer i:num) {
	sum=sum+i;
}
System.out.println("sum of elements is "+sum);


	}

}
