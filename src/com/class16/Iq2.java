package com.class16;

import java.util.Arrays;

public class Iq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//first way
		/*int[] array= {11,45,85,98};
		 Arrays.sort(array);
		int max=array[array.length-1];
		int min=array[0];
		int secondNum=array[array.length-2];
		System.out.println(max);
		System.out.println(min);
		System.out.println(secondNum);*/
		
//second way
		
		
		int[] a= {9,8,5,67,45,56,38};
		int max1 = a[0];
		int secondMax = a[0];
		int min2=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max1 = a[i];
			}else if(min2>a[i]){
				min2 =a[i];
			}else if (secondMax < max1 && a[i] > secondMax) {
				secondMax = a[i];	
			}
		}
		
		
		System.out.println(max1);
		System.out.println(min2);
		System.out.println(secondMax);
	}

}
