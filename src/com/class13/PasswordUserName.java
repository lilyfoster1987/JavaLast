package com.class13;

import java.util.Scanner;

public class PasswordUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String username, password1,password2;

do {
System.out.println("enter your username");
username=scan.nextLine();

	boolean a=username.isEmpty();
	if (username.isEmpty()) {
        System.out.println("Username can not be empty !! Try again");
	}
	
}while(username.isEmpty());
	do {
	
	System.out.println("Please enter your password");
	password1=scan.nextLine();
	
	if (password1.isEmpty()) {
		System.out.println("password can not be empty");
	
	}
		else  if(password1.contains(username)) {

			System.out.println("password can not contain username");
			System.out.println("Please enter your password");
			password1=scan.nextLine();}
			else  if(password1.length()<=8) {
				System.out.println("password can not be short than 8 char");
				System.out.println("Please enter your password");
				password1=scan.nextLine();
				
			

				}
				
	
	          
	}while(!password1.isEmpty() ||password1.length()>8 ||!password1.contains(username));
	
	
	do {
		
	

			System.out.println("please confirm your password");
			password2=scan.nextLine();
			if(password1.equals(password2)) {
			System.out.println("password can not be diffrent");
			}
			else
			{
			System.out.println("ACCEPTED");
			}
			
			
		
		
	}
	while(!password2.equals(password1));
	
	}}
