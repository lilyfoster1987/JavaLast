package com.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
	
	int [][] num={ {2,1,3,8},{3,5,9,25},{10,73,14,16}};
	int sumeven=0;	
	int oddSum=0;
	for (int i=0; i<num.length; i++)
		for (int j=0; j<num[i].length; j++) {
			if(num[i][j]%2==0) {
				
			System.out.print(num[i][j]+" ***");
			sumeven+=num[i][j];
		}
			else {
				oddSum+=num[i][j];
				System.out.println(num[i][j]+" ");
				
			}
			System.out.println();
		}
	System.out.println("even number total"+sumeven);
	System.out.println("odd number total"+oddSum);
	}

}
