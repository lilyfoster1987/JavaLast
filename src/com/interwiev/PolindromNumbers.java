package com.interwiev;

import java.util.Scanner;

public class PolindromNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("enter a number");
String num=scan.nextLine();
char [] num1=num.toCharArray();
char [] array=num.toCharArray();


for(int i=array.length-1; i>=0; i--) {
	System.out.print(array[i]);
	
	
}

if (num1.equals(array)) {
	
	System.out.println("it is polindrom");
}else {
	
	System.out.println("it is not polindrom");
}
	
	}

}
