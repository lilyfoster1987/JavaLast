package com.class18;

public class ComputerObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer com1=new Computer();
		com1.brand="Apple";
		com1.name="mac book pro";
		com1.keyboard="true";
		com1.memory=500;
		com1.screen=18;
		
		//behavior/actions as mesthod()
		com1.playGames();
		com1.javaCoding();
		com1.watchMovie();
		
		System.out.println("computer's brand is"+ com1.brand);
		System.out.println("computer's screen is"+com1.screen+" and mmemory of it is "+ com1.memory);
	}

}
