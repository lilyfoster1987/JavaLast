package com.class11;

public class MsMrsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
Create a 2D array that first row will contain 4 names and second row will contain grades. Then you program should print name of the students that has as an A and B grade
		
	
*/
		String[][] msrAdd={ {"Mr","Mrs","Ms","Miss"},{"Smith","Jordan","Jackson","Obama"}};
		int k=0;
		for (int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				
				System.out.println(msrAdd[i][j] + " "+ msrAdd[i+1][j]);
				
			}}
			
			
		
		
		
		
		
}
}


