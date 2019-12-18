package com.rewiev27;

public class Phone {
	private String serialNumber;
	String color;
	public Phone(String serilaNumber) {
		this.serialNumber=serialNumber;
		
	}
	public void text(String number, String text) {
		System.out.println("sending:"+text+" to"+number);
	}
	public void call(String number) {
		System.out.println("calling: "+number);
	}
	public void display() {
		System.out.println("i am a "+color+" phone serial number: "+serialNumber);
	}
	public String getSerialNumber(String password) {
		String result;
		if(password.contentEquals("123456")){result=serialNumber;
				}
		else {
			System.out.println("denied....");
		}
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
class SmartPhone extends Phone implements Weather,Camera{
public SmartPhone(String serialNumber) {
	super(serialNumber);
}
	public SmartPhone(String serilaNumber,String color) {
		super(serilaNumber);
		super.color=color;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void showWeather() {
		System.out.println("show weather");
		
	}
	@Override
	public void takePitcure() {
		// TODO Auto-generated method stub
		System.out.println("take pitcure");
	}
	public void display() {
		System.out.println("i am a"+ color+ "color phone");
	}
	
}
