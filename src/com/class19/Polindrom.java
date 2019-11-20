package com.class19;

public class Polindrom {

	
	void polindrom(String str) {
		String str2="";
for(int i=str.length()-1; i>=0; i--) {
			
			str2=str2+str.charAt(i);
			
;			
		}
		
		if(str.equals(str2)) {
			
			System.out.println("it is polindrom");
		}
		else {
			
			System.out.println("it is not polindrom");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polindrom word=new Polindrom();
word.polindrom("radar");
word.polindrom("zeynep");
	}

}
