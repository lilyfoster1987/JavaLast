package com.class10;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []a;
		
		int []b;
		
		b=new int[4];
		
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[2]);
		
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manuel Testing";
		classes[3]="GIT";
		System.out.println("TODAY WE HAVE"+ classes[0]);
		
		
		
		int[] nums= new int[3];
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
	
		
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		String[] names= new String[3];
		/*
		names[0]="dianna";
		names[1]="seda";
		names[2]="olga";
		ArrayIndexOutOfBoundExeptions
		System.out.println(names[3]);//it gives error becasuse we declared as 3 variable
		*/
		// we are putting less elements
		//compiler givess default values
		int[] a1=new int[4];
		a1[1]=12;
		a1[3]=45;
		System.out.println(a1[0]);
		
		
		
		
		
		
		
		;
	}

}
