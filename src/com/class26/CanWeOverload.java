package com.class26;

public class CanWeOverload {

	//can we overload a private method?YES
	private void met1() {
	System.out.println("i am method one");
	
}
private void met1(String str) {
	System.out.println("i am method one with "+str);
	
}
//can we overload main method>>>>>YESSS
//can we overload STATIC  method>>>>>YESSS
public static void main(String[] args) {
	System.out.println("i am main method");
	CanWeOverload ob=new CanWeOverload();
	ob.main("zeyenp",5);
	main("zeyenep",6);
	String [][] arr= {{"5","6"},{"4","6"}};
	main(arr);
}
public static void main(String[][] args) {
	System.out.println("i am amain method with string arguments");
}
public static void main(String str,int a) {
	System.out.println("i am main method 2 arguments");
}
}
