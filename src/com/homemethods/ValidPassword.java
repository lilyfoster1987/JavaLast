package com.homemethods;

public class ValidPassword {
boolean valid(String str) {
	boolean result;
	char[] array=str.toCharArray();
	int digitSize=0;
	int letterSize=0;
	int lengthofarray=array.length;
	
	for (int i = 0; i < array.length; i++) {
		
		if(Character.isLetter(array[i])) {
			letterSize++;
			}
		else if(Character.isDigit(array[i])) {
			digitSize++;
		}
		
	}
	
	if(letterSize>=8 && digitSize>=2) {
		result=true;
	}else {
		result=false;
	}
		
	
	return result;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPassword password=new ValidPassword();
		boolean valid=password.valid("zeynephasan123");
		System.out.println(valid);
		boolean valid1=password.valid("hasan123");
		System.out.println(valid1);
		
	}

}
