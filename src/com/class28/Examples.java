package com.class28;

public class Examples {
public String helloName(String str) {
	return str;
	
}
public String helloName(String str1,String str2) {
	return str1+" "+str2;
	
	
}


}
class smallExample extends Examples{
	public String helloName(String str) {
		return "hello "+str;
		
	}
}
