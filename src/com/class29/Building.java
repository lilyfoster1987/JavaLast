package com.class29;

public class Building {
int floor;
String adress;
Building(int floor,String adress){
	this.floor=floor;
	this.adress=adress;
	
}
Building(){
	
}


}
class Room extends Building{
	int roomNumber;
	Room(int floor,String adress,int roomNumber){
		super(floor,adress);
		this.roomNumber=roomNumber;
		
		
	}
	public void print() {
		System.out.println(adress+" "+floor+" "+roomNumber);
	}
}
