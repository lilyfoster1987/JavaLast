package com.home.array;

import java.util.Scanner;

public class Print10Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

int[] array=new int[10];


for(int i=0; i<array.length; i++) {
	System.out.println("enter the elements");
	array[i]=scan.nextInt();
}
for(int i=0; i<array.length; i++) {
	System.out.println(" the elements are "+array[i]);
}

	}

}
