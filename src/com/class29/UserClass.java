package com.class29;
/*Write program: userClass  that has a constructor that initializes name and mobile 
number istance variables. Create a subclass  userInfo that will have user address
variable and it also being initialized through constructor call. Print users name, 
mobile number and address in userDetails method. Test your code.*/

public class UserClass {
	String name;
	String mobileNumber;
	
UserClass(String name, String mobileNumber){
	this.name=name;
	this.mobileNumber =mobileNumber;
}
public static void main(String[] args) {
	UserInfo user=new UserInfo("zeynep","789456123","1777 timber creek rd");
	user.userDetails();
}
}
class UserInfo extends UserClass{
	String adress;
	UserInfo(String name, String mobileNumber,String adress) {
		super(name, mobileNumber);
		this.adress =adress;
		
	}
public void userDetails() {
	System.out.println("Name is "+name+",   mobile number is "+mobileNumber+" and adress is "+ adress);
}
	
	
}