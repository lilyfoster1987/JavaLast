package com.class11;

public class StudendGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a 2D array that first row will contain 4 names and second row will contain grades. Then you program should print name of the students that has as an A and B grade
		
		
		
	String [][] nameGrade= {{"ZEYNEP","HASAN","OZLEM","HILAL"},{"C","A","A","B"}};	
		for (int i=0; i<nameGrade.length; i++) {
			
			
			for (int j=0; j<nameGrade[i].length; j++){
				
				System.out.println(nameGrade[i][j]+ " has an "+nameGrade[i+1][j] +" grade.");
				
				
			}
			System.out.println();
		}
	}

}
