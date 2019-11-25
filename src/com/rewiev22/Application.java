package com.rewiev22;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,8,2,9,3,6};
		ArrayManipulation obj1=new ArrayManipulation();
		int result=obj1.largestNumber(arr);
		int sum=obj1.sumOfArray(arr);
		System.out.println("largest number is "+result);
		
		System.out.println(ArrayManipulation.sumOfArray(arr));
		System.out.println(sum);
		System.out.println(obj1.sumOfArray(arr));
		
	}

}
