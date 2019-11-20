package com.rewiev14;

public class Baby {
String firstName;//features, variables, fielads
String lastName;
char gender;
int weight;
String hairColor;
void talk() {
	System.out.println(firstName+" bla bla bla");
}
void walk(int times) {
	for(int i=0; i<times; i++) {
	System.out.println(firstName+" crawl");}

}
void cry() {
	System.out.println(firstName+" cyr every minute");
}
void displayBabyInfo() {
	System.out.println("Full name is "+firstName+"" +"and lastname is " +lastName+", gender of baby is   "+gender+" ,weight of baby is "+weight+" and hair color is "+hairColor);
}
}
