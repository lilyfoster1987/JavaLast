package com.class13;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
	 //should be true

	int row=a.length;
	int column;
	boolean s=true;
	for(int i=0; i<row; i++){
	  
	 
	 
		if(row==a[i].length){
		  s=true;
		  
		}
		else{
		  
		 s=false;
		   break;
		}
		
	  }
		
	    
	System.out.println(s);  
	
	}

}
