package com.class30;

public abstract class Phone {
	//implemented methods
	public void makeCall() {
		System.out.println("Make call");
		
	}
	public void sendText() {
		

}
	//unimplemented methods
	public abstract void takePictures();
	public abstract void playGames();
}
class Iphone extends Phone{

	@Override
	public void takePictures() {
		System.out.println("iphone takes pitcures");
	}

	@Override
	public void playGames() {
		System.out.println("play games on iphone");
		
	}
	
	
	
}
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pitcures");
		
	}

	@Override
	public void playGames() {
		System.out.println("play game on samsung");
		
	}
	
}
	
