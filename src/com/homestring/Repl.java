package com.homestring;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    for(int i=0;i<=word.length()-1;i++){
		      System.out.print(word.charAt(i++));
		    }
	    
	   
	}

}
