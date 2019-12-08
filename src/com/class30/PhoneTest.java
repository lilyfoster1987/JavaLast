package com.class30;

public class PhoneTest {
public static void main(String[] args) {
	//Phone obj=new Phone();
	//we can not create an object of abstract class
Phone phone1=new Iphone();
phone1.makeCall();
phone1.sendText();
phone1.takePictures();
phone1.playGames();
	
}
}
