package com.home.data;

public class TekrarSilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string veya sayi array da tekrarlayan elemanlari silen code yazan var mi?
		String str="zeynepp124588877";
		
		char[] arr=str.toLowerCase().trim().toCharArray();
		
		for (int i = 0 ; i < arr.length ; i++)
		{
			int sayac = 0;

		for (int j = 0 ; j < i ; j++)
		{
		if (arr[i] == arr[j])
		{
		sayac= 1;
		break;
		}
		}

		if (sayac== 0)
		{
		System.out.print(arr[i]);
		}
		}

		

		}
		}