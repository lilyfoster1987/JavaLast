package com.class28;

public/* final*/ class FinalKeyword {//if you final class you can not inheritince
	public final String str="heloo";
public static void main(String[] args) {

	String str="i am awesome";
	str="i am cool";
	System.out.println(str);
	final String finalStr="java is easy";
	//finalStr="java is hard";  we can not write like this
	final int age=100;
	//age=49;
	FinalKeyword obj=new FinalKeyword();
	obj.hello("zeynep");
	}

public final void hello() {
	System.out.println("i am a final method in parent class");
}
public final void hello(String str) {
	System.out.println("i am a final method in parent class "+str);
}

}
class FinalKeywordChil extends FinalKeyword{
	/*public final void hello() {
		System.out.println("i am a final method in parent class");
	}*/
	//final method can not be overriden we will get an compiller error
}
