package com.class38;
/*Create a method with below Specification. 
Method Label: comparingNumber. 
return type: void
parameter:  integer number.

Method logic: 
If the given number is greater that 10, Print out  "Number is greater that 10"
else 
throw exception and say "Number is less than 10"

Handle exceptions in method using try and catch block and print the message only. 

In Main method Call the method and pass 9 as parameter. 

Ouptut: 

Number is less than 10*/
public class repl {
public static void main(String[] args) {
	comparingNumber(9); 
}
public static void comparingNumber(int number)  {
	
	if(number>10) {
		System.out.println("Number is greater that 10");
	}else {
		callingExceptionMethod();	
		 
	}
	
}
public static void throwingException() {

	ArithmeticException ae = new ArithmeticException();
	throw (ae);
}

public static void callingExceptionMethod() {

	try {
		throwingException();
	} catch (ArithmeticException ae) {
		System.out.println("Number is less than 10");
	}

}}
