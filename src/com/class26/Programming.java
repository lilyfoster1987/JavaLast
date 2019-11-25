package com.class26;

public class Programming {
public void pass(int grade) {
	
	if (grade>85) {
		
		System.out.println("i love programming languages");
	}else {
		
		System.out.println("you should study more");
	}

	
}
public void pass(String language) {

System.out.println("i love  "+language);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming obj=new Programming();
		obj.pass(90);
		obj.pass("C++");
	}

}
