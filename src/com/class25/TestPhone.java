package com.class25;

public class TestPhone {
	public static void main(String[] args) {
		PhoneA phone1=new PhoneA("APPLE","iphone11",500,true,1000);
		phone1.save();
		phone1.takePhoto();
		phone1.charge();
		System.out.println("******************");
		
		PhoneB phone2=new PhoneB("APPLE","iphone10",250,true,750);
		phone2.takePhoto();
		phone2.save();
		System.out.println("********************");
		PhoneC phone3=new PhoneC("APPLE","iphone8",32,false,500);
		phone3.save();
		
	}

}
