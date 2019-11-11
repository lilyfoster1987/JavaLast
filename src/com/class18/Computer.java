package com.class18;

public class Computer {

	String keyboard, name, mouse,brand;
	int screen,memory;
	void playGames() {
		
		System.out.println("i can play on my "+ name);
	}
	void javaCoding() {
		System.out.println("i van do java" + name);
	}
	void watchMovie() {
		System.out.println("i can watch movie on my "+name);
	}
	public static void main(String [] args) {
		Computer com2=new Computer();
		com2.name="Samsung intell";
		com2.brand="Samsung";
		com2.memory=450;
		com2.watchMovie();
		com2.playGames();System.out.println("i have "+ com2.brand+" "+com2.name);
		
		
	}
}
