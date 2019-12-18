package com.abstractionss;

public class RegistrationTest {
	public static void main(String[] args) {
		Registration user=new Registration();
		
		user.setEmail("lily@gmail.com");
	    String email=user.getEmail();
	    System.out.println(email);
		user.setUserName("zeynep40");
		String name=user.getUserName();
		System.out.println(name);
		user.setPassword("ha45ha");
		String password=user.getPassword();
		System.out.println(password);
	}
}
