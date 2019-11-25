package com.oop;

public class RepeatOfWords {
 //We can write a program to find out how many times all the words repeated in the string.

	String str;
	RepeatOfWords(String str){
		this.str=str;
	}
	public void repeat() {
		String [] array=str.split(" ");
		int count=0;
		String repeatedWord=" ";
		for (int i = 0; i < array.length; i++) {
			count=1;
			for (int j = i+1; j < array.length; j++) {
				if(array[i].equals(array[j])) {
					count=count+1;
					array[j]=repeatedWord;
				}
				
			}
			if(!(array[i].equals(repeatedWord))) {
			System.out.println(array[i] +" is repeated " + count + " times.");	
		}}
		
	}
	
	public static void main(String[] args) {
		RepeatOfWords obj=new RepeatOfWords("today is very cold and tomorrow will be very cold too");
		obj.repeat();

	}

}
