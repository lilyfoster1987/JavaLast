package com.homemethods;
import java.math.*;
public class Rate {
double interestRate(double amount, int interest, int year) {
	double result;
	
double x=interest/100;
	double num1=(1+(x/12));
	int num=12-year;
	result=amount*(Math.pow(num1,num));
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Write a Java method to compute the future investment value at a given interest rate for a specified number of years. Go to the editor
		Sample data (Monthly compounded) and Output:
		Input the investment amount: 1000
		Input the rate of interest: 10
		Input number of years: 5

		Expected Output:

		Years    FutureValue                                     
		1            1104.71                                     
		2            1220.39                                     
		3            1348.18                                     
		4            1489.35                                     
		5            1645.31
		*/
		
		Rate  obj=new Rate ();
		double result1=obj.interestRate(1000, 10, 5);
		System.out.println(result1);
		
	}

}
