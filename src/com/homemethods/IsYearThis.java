package com.homemethods;

public class IsYearThis {
boolean isYear(int year) {
	boolean y;
	if(year==2019) {
		y=true;
	}else {
		y=false;
	}
	return y;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a Java method to check whether a year (integer) entered by the user is a leap year or not. Go to the editor

		 Expected Output:

		 Input a year: 2017                                                                        
		 false*/
		IsYearThis obj=new IsYearThis();
		boolean result=obj.isYear(2015);
		System.out.println(result);
		
	}

}
