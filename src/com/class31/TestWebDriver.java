package com.class31;

public class TestWebDriver {

	public static void main(String[] args) {
		ChromeDriver driver1=new ChromeDriver("Chrome");
		driver1.openBrowser();
		driver1.closeBrowser();
		driver1.findElement();
		driver1.maximizeWindow();
		System.out.println("******************");
		FirefoxDriver driver2=new FirefoxDriver("Firefox");
		driver2.openBrowser();
		driver2.closeBrowser();
		driver2.findElement();
		driver2.maximizeWindow();
TakeScreenshot obj=new FirefoxDriver("Firefox");
obj.takePhoto();

	}

}
