package com.home.array;

import java.util.Scanner;

public class Array10Integerinclude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);



int [] a= new int[10];


for(int get:a) {
	
	System.out.println("enter the elements");
	a[get]=scan.nextInt();
}


System.out.println("enter a number");
int num=scan.nextInt();
for(int i=0; i<a.length; i++) {
	
	if(num==a[i]) {
		
		System.out.println("the array include the "+num);	
	}
	else{System.out.println("it does not exist");
		
	}
}
	}

}
