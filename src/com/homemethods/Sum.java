package com.homemethods;

public class Sum {
int sumNumbers(int a, int b) {
	int sum=a+b;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum obj=new Sum();
int sum=obj.sumNumbers(5, 9);
System.out.println(sum);
	}

}
