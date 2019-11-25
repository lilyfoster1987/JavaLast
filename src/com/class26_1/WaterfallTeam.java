package com.class26_1;

import com.class26.Employee;

public class WaterfallTeam  extends Employee{
	
	public static void main(String[] args) {
		WaterfallTeam ob=new WaterfallTeam();
		ob.salary=45644;
		ob.companyName="Syntax";
		ob.employeeId=102;//accesing protected variable in different package ehen it is inherited class
	}

}
