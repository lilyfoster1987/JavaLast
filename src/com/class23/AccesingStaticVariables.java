package com.class23;

public class AccesingStaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Husky obj=new Husky();
obj.name="Sahrik";
Husky.breed="new breed";
System.out.println(obj.name);
System.out.println(Husky.breed);
System.out.println(obj.breed);
	}

}
