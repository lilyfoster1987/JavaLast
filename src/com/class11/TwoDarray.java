package com.class11;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] num= {{1,2,4},{45,75,85,95},{2,4,6,8,10}};
		for (int i=0; i<num.length;i++) {
			
			for (int j=0; j<num[i].length; j++) {
				
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
