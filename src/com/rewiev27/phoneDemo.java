package com.rewiev27;

public class phoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone phone=new Phone("123-456-789");
phone.color="blue";
phone.text("123-123-456","Privet");
phone.display();
System.out.println(phone.getSerialNumber("123456"));
System.out.println(phone.getSerialNumber("1234"));
System.out.println("---------smartphone generation-----------");

//up casting is done imlicitliy
Phone iphone=new SmartPhone("i123-456","red");
iphone.call("123456789");
iphone.text("456789456", "selam");

//downcasting has to be done explicitly
SmartPhone smartphone=(SmartPhone)iphone;
smartphone.takePitcure();
smartphone.showWeather();


	}

}
