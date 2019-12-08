package com.abstractionss;

public class RegistrationTest {
	public static void main(String[] args) {
		Registration user=new Registration();
		
		user.setEmail("lily@gyahoo.com");
	    String email=user.getEmail();
	    System.out.println(email+" is valid");
		user.setUserName("zeynep40");
		String name=user.getUserName();
		System.out.println(name+" is valid");
		user.setPassword("ha45ha");
		String password=user.getPassword();
		System.out.println(password+" is valid");
	}
}
