package com.class11;

public class TwoArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] names= {{"Khan","yusuf","alex","zeynep"},{"muhammed","ann","neslihan","ali"},{"ayse","fatma","hasan","mehmet"}};
	
	int a=names.length;//gives row size
	int b=names[0].length;//gives coulums size
	
	for(String getNames[]:names) {
		for(String getName:getNames) {
			System.out.print(getName+ " ");
			
		}
		System.out.println();
	}
	
	}

}
