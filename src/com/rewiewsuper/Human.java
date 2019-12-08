package com.rewiewsuper;

public class Human {
String name;
int age, weight;
public Human() {
	System.out.println("i am a human created constructor");
}
public Human(String name) {
	this();
	this.name=name;
	System.out.println("the name of person is "+this.name);
	
}
public Human(String name,int age,int weight) {
	this.name =name;
	this.age =age;
	this.weight =weight;
}
public String greeting() {
	return "hello";
	
}
public void talk() {
	System.out.println("kak dilla");
	
}
}
class Albanian extends Human{
	String albanianId;
	Albanian(){
		
	}
	public String greeting() {
		return "i dont know";
		
	}
	public void talk() {
		System.out.println("i dont know..");
	
	
}}
class American extends Human{
	String SSN;
	public American(String name,int age,int weight,String SSN) {
		super(name,age,weight);
		this.SSN=SSN;
	}
	public void taxReturns() {
		System.out.println("I am doing ma tax return.");
	}
	public String greeting() {
		return "hello";
		
	}
	public void talk() {
		System.out.println("good eveningg...");

}}
	class Turkish extends Human{
		String language;
		public Turkish(String name,int age,int weight,String language) {
			super(name,age,weight);
			this.language=language;
			
		}
		public void likeKebab() {
			System.out.println("i like kebab");
		}
		public String greeting() {
			return "merhaba";
			
		}
		public void talk() {
			System.out.println("i can speak in "+this.language);}}

