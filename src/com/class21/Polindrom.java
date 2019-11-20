package com.class21;

public class Polindrom {

	public boolean polindrom(String str) {
String str2="";
	boolean result=true;	

		for(int i=str.length()-1; i>=0; i--) {
			
			str2=str2+str.charAt(i);
			
;			
		}
		
		if(str.equals(str2)) {
			
			result=true;	
		}
		else {
			
			result=false;	
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polindrom obj=new Polindrom();
boolean result1=obj.polindrom("radar");
System.out.println(result1);
	}

}

