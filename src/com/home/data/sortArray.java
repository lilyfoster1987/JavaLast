package com.home.data;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
	
	
		  int [] num={98,7,6,856,12,63};
		  String[] name={"zeynep","hasan","gul","ali"};
		  Arrays.sort(name);
		  Arrays.sort(num);
		  for(int last:num)
		  {
		    System.out.print(last+" ");
		    
		  }
		  
		  for(String sortName:name)
		  {
		    System.out.print(sortName+" ");
		    
		  }
	
	}
	

}
