package com.class14;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Jav is getting nteresting";
		System.out.println(str.substring(15));
		System.out.println(str.substring(5, 8));
		
		
		String str1="hasan";
		for(int i=str1.length()-1; i>=0; i--)
		{
			
			System.out.print(str1.charAt(i));
		}
		
		
		
		System.out.println();
		
		if (!str1.isEmpty()) {
			if(str1.length()>3 || str1.length()%2!=0) {
				
					int i=str1.length()/2;
					
					System.out.println(str1.charAt(i));
				
				
			}
			
			
		}
		
	}

}
