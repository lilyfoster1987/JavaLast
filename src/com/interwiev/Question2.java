package com.interwiev;



public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,5,8,1,0,9};
		
		int min=num[0];
		int max=num[0];
		int secondMax=num[0];
		for(int i=0; i<num.length; i++) {
			
			if(max<num[i]) {
				
				max=num[i];
			}
			else if(min>num[i]) {
				
				min=num[i];
				
			}
			else if(max>secondMax && num[i]<secondMax)
				secondMax=num[i];
			{
				
				
			}
			
		}
			
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(secondMax);
	}
}
