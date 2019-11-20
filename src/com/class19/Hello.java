package com.class19;

import java.util.Scanner;

public class Hello {
	
	void sayHello(String name) {//methods with parameters
		
		System.out.println("hello "+name);
	}
	
		public static void main(String [] args) {
			
		Hello obj=new Hello();
		obj.sayHello("zeynep");
		obj.sayHello("Hasan");
		
		obj.sayHelloDifferentLanguage("turkey");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Albenia");
		obj.sayNameNadAge("hasan", 40);
		obj.sayNameNadAge("zeynep",35);
		obj.isItSnow(true);
		}
	void isItSnow(boolean snow) {
		if (snow==true) {
			System.out.println("Stay at home");
			
		}else {
			System.out.println("go to for a walk");
		}
		
	}
void sayHelloDifferentLanguage(String country) {
	
	
	
switch(country.toLowerCase()) {

case "usa":
	System.out.println("hello");
	break;
case "russia":
	System.out.println("Privet");
	break;
case "turkey":
	System.out.println("merhaba");
	break;
case "paraguay":
	System.out.println("Hola");
	break;
case "albenia":
	System.out.println("Pershedetje");
	break;
	default:
		System.out.println("i dont know");
		break;
}

}

void sayNameNadAge(String name, int age) {
	
	System.out.println("my name is "+ name+ " i am "+ age+" years old");
}


}
