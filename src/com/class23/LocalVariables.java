package com.class23;

public class LocalVariables {
void sayName() {
	String myName ="john";
	System.out.println(myName);
}
String  creatEmail(String name,String lastName, String email) {
	String useremail=name+lastName+"@"+email+".com";
	return useremail;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalVariables obj=new LocalVariables();
obj.sayName();
String result=obj.creatEmail("zeynep","celik","gmail");
System.out.println(result);
	}

}
