package com.class11;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] num= {{1,2,3,4},{6,8,7,4},{10,20,30,40}};
	for (int i=0; i<num.length; i++) {
		for (int j=0; j<num[i].length; j++){
			System.out.print(num[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("********************************");
	for(int getnum[]:num) {
		
		for(int getcolumn:getnum) {
			
			System.out.print(getcolumn+" ");
		}
	}
	}

}
