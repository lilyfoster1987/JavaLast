package com.class38;

public class ExeptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=0;
try {
	System.out.println("start of try exeption");
	System.out.println(a/b);
	System.out.println("continue try exeption");
}catch(ArithmeticException e) {
	//System.out.println("i am code inside catch");
	e.printStackTrace();
	//System.out.println(e);
	//System.out.println(e.getMessage());
	
}
System.out.println("end of the code");
	}

}
