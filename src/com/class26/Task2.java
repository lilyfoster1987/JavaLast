package com.class26;

public class Task2 {
public static void speak() {
	System.out.println("i can speak");
}
public static void speak(String language1,String language2) {
	System.out.println("i can speak "+language1+" "+language2);
}
public static void speak(String language1,int year) {
	System.out.println("i can speak"+language1+" for "+year+" years.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 person=new Task2();
		
		speak();
		speak("english",6);
		speak("English","Turkish");
	}

}
