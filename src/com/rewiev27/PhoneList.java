package com.rewiev27;

import java.util.ArrayList;

public class PhoneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Phone> phoneList=new ArrayList<>();
System.out.println(phoneList.size());
System.out.println(phoneList);
phoneList.add(new Phone("123456"));
phoneList.add(new Phone("111111"));
phoneList.add(new Phone("222222"));
SmartPhone iphone1=new SmartPhone("556645","white");
Phone phone2=iphone1;
phoneList.add(iphone1);
phoneList.add(new SmartPhone("123456","black"));

	}

}
