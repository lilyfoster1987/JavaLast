package com.class27;

public class WebDriver {

	
	public void open() {
		System.out.println("Browser is open");
	}
	public void refresh() {
		System.out.println("Refreshing browser");
	}
	
	
}
class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("Chrome  is open");
	}
}
class FirefoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("Firefox is open");
	}
	
	public void getTitle() {
		
		System.out.println("getting title ");
	}
}