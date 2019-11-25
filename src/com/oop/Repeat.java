package com.oop;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="today is very cold and tomorrow will be very cold too";
		String [] array=str.split(" ");
		int count=0;
		String repeatedWord="";
		for (int i = 0; i < array.length; i++) {
			count=0;
			for (int j = 0; j < array.length; j++) {
				if(array[i].equals(array[j])) {
					count=count+1;
					
				}
				
			}
			
			System.out.println(array[i] +" is repeated " + count + " times.");	
		}
		
	}
}
