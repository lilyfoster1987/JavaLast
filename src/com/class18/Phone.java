package com.class18;

public class Phone {
String name, cam, os;
int screen, memory;
void call() {
	System.out.println("you can call with "+name);
}
void save() {
	
	System.out.println("you can save your files to in "+ memory+" gb area" );
}
void takingPitcure() {
	
	System.out.println("you can ta a pitcutre with its "+ cam);
}
public static void main(String [] args) {
Phone phone1=new Phone();
phone1.name="Iphone";
phone1.os="IOS";
phone1.cam="true";
phone1.screen=8;
phone1.memory=32;
phone1.takingPitcure();
phone1.save();
phone1.call();
System.out.println("*********************");
Phone phone2=new Phone();
phone2.name="nokia";
phone2.os="android";
phone2.cam="true";
phone2.screen=10;
phone2.memory=16;
phone2.takingPitcure();
phone2.save();
phone2.call();

Phone phone3=new Phone();
phone3.name="Samsung";
phone3.os="IOS";
phone3.cam="true";
phone3.screen=16;
phone3.memory=64;
phone3.takingPitcure();
phone3.save();
phone3.call();


}


}
