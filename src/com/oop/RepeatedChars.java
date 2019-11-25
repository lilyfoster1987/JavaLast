package com.oop;
/*We can write a program to find out how many times all the 
characters repeated in the string.*/
public class RepeatedChars {
	String str;
	
	RepeatedChars (String str){
		this.str=str;
	}
	public void repeat() {
		char[] array=str.toCharArray();
		int count=0;
		char repeat1='a';
		for (int i = 0; i < array.length; i++) {
			count=1;
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					count+=1;
					array[j]=repeat1;
				}
			}
			if(array[i]!=repeat1)
			System.out.println(array[i]+" "+count+" times repeated.");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedChars obj=new RepeatedChars ("zeynep");
		obj.repeat();
	}

}
