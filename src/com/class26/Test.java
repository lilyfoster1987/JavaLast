package com.class26;

public class Test {
	public static void main(String[] args) {

		System.out.println("Creating an object of a Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();

		System.out.println("---Creating an object of a Scrum Team class-----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();

		System.out.println("---Creating an object of a Developer class-----");
		Devoloper dev=new Devoloper();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		
	System.out.println("---Creating an object of a Tester class-----");
	Tester tes=new Tester();
	tes.salary=15000;
	tes.work();
	tes.getPaid();
	tes.test();
	tes.artifacts="test case";
	tes.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
	tes.attendScrumMeetings();
	
	System.out.println("---Creating an object of a ScrumMaster class-----");
	ScrumMaster suc=new ScrumMaster();
	suc.salary=18000;
	suc.work();
	suc.getPaid();
	suc.coordinateTeam();
	suc.artifacts="rtm";
	suc.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
	suc.attendScrumMeetings();
	
	System.out.println("---Creating an object of a business analyst class-----");
	BusinesAnalyst bus=new BusinesAnalyst();
	bus.salary=18000;
	bus.work();
	bus.getPaid();
	bus.writeRequirement();
	bus.artifacts="requirements";
	bus.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
	bus.attendScrumMeetings();
	
	
		
	}
}
