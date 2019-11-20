package com.class21;

public class USA {

	private String capitalCity="WashingtonDC";
	public String mainState="NEY YORK";
	protected String school="Syntax";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
USA us=new USA();
System.out.println("Acces from inside USA classes");
System.out.println(us.mainState);
System.out.println(us.school);
System.out.println(us.capitalCity);

	}

}
