package com.class13;

import java.util.Arrays;

import com.class11.Array;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= {5,7,8,3,1,41,52};
		
Arrays.sort(array);
for(int i=array.length-1; i>=0; i--) {
	
	System.out.print(array[i]+ " ");
}
System.out.println("*****************");
		for(int small:array) {
			System.out.print(small+"*");
		}

	}

}
