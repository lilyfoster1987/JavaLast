package com.class24;

public class SyntaxTechnologies {
	String schoolName;
	  int batch;
	 String year;
	 String lastDayOfClass;
	SyntaxTechnologies(){
	  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	SyntaxTechnologies( String schoolName1,  int batch1, String year1, String lastDayOfClass1){
	schoolName=schoolName1;
	batch=batch1;
	year=year1;
	lastDayOfClass=lastDayOfClass1;
	  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	 public static void main(String [] args){
		    SyntaxTechnologies ob1=new SyntaxTechnologies();
		    SyntaxTechnologies ob2=new SyntaxTechnologies("Syntax", 4,"2019","07/30/2019");
		    
		    
		  }
	  
	}