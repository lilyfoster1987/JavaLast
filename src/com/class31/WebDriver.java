package com.class31;
public interface WebDriver extends TakeScreenshot {
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
}
interface  TakeScreenshot {
	void  takePhoto();
	//added from jdk 1.8
	static void takeSelfie() {
		System.out.println("i am defined static method of takescreenshot");
	}
	default void takePictures() {
		System.out.println("i am default method of takescreenshot");
	}
}
class ChromeDriver implements WebDriver, TakeScreenshot{
	String browser;
	ChromeDriver(String browser){
		this.browser=browser;
	}
	public void openBrowser() {
		System.out.println("You can open "+browser);
		
	}
	public void closeBrowser() {
		System.out.println("You can close "+browser);
		
	}
	public void maximizeWindow() {
		System.out.println("You can maximize the window in "+browser);
		
	}
	public void findElement() {
		System.out.println("You can find what you want in "+browser);

	}
	@Override
	public void takePhoto() {
		System.out.println("takes photo");
	}
}
class FirefoxDriver implements WebDriver{
	String browser;
	FirefoxDriver(String browser){
	this.browser=browser;}
	public void openBrowser() {
		System.out.println("You can open "+browser);
		
	}
	public void closeBrowser() {
		System.out.println("You can close "+browser);
		
	}
	public void maximizeWindow() {
		System.out.println("You can maximize the window in "+browser);
		
	}
	public void findElement() {
		System.out.println("You can find what you want in "+browser);

	}
	@Override
	public void takePhoto() {
		System.out.println("takes photos");
	}
	
		
	
	
}
