package com.homestring;

public class ThreeDigitNumbers {
void numbers(int a, int b, int c) {
	int sum=0;
	for(int i=1; i<=a; i++) {
		for(int j=1; j<=b; j++) {
			
				if(a != i && a!= j && i != a){
					sum++;
					System.out.println(i + "" + j+ "" + a);
				
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
 * Also count how many three-digit numbers are there.*/
		
		ThreeDigitNumbers n1=new ThreeDigitNumbers();
		n1.numbers(5, 4, 3);
		
		int[] num_array = {50, -20, 0, 30, 40, 60, 10};
	    
		System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length-1]);
	}

}
