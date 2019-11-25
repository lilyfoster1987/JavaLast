package com.rewiev22;

public class ArrayManipulation {
protected int largestNumber(int [] array) {
	int max=array[0];
	
	for (int i = 0; i < array.length; i++) {
		if(max<array[i]) {
			max=array[i];
		}
	}
	
	return max;
}
public static int sumOfArray(int[] array) {
	
int sum=0;
	
	for (int i = 0; i < array.length; i++) {
		
			sum=sum+array[i];
		}
	
	
return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
