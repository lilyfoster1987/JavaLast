package com.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] array=new String [2][3];
		
		array[0][0]="zeynep";
	    array[0][1]="hasan";
		array[0][2]="ali";
		array[1][0]="ayse";
     	array[1][1]="fatma";
	    array[1][2]="oya";
	   
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.println(array[i][j]);
			}
		//3 row 5 colums
			
			
		}
		
		//To identify the numbers of Rows
       // System.out.println(�The numbers of Rows are:= �+numbers.length);
        
        //To identify the numbers of Columns/elements in that row
        //System.out.println(�The numbers of Rows are:= �+numbers[0].length);
		
	}

}
