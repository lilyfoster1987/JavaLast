package com.class27;

public class TestDriver {

	public static void main(String[] args) {
		ChromeDriver ob=new ChromeDriver();
		
		ob.open();
		ob.refresh();
		System.out.println("********************");
		FirefoxDriver ob2=new FirefoxDriver();
		ob2.open();
		ob2.refresh();
		ob2.getTitle();
		System.out.println("********************");
		WebDriver obj1=new ChromeDriver();
		obj1.open();
		obj1.refresh();
		System.out.println("********************");
		WebDriver obj2=new FirefoxDriver();
		
		obj2.open();
		obj2.refresh();
		
	}

}
