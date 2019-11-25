package com.class25;

public class Child  extends Parent{
public void code() {
	System.out.println("i can code");
}
public static void main(String[] args) {
	Child c1=new Child();
	System.out.println(Child.race);
	System.out.println(c1.haircolor);
	System.out.println(c1.eyecolor);
	c1.sing();
	c1.code();
	System.out.println("***********************");
	Child2 c2=new Child2();
	c2.eyecolor="blue";
	c2.haircolor="Blonde";
	System.out.println(Child.race);
	System.out.println(c2.haircolor);
	System.out.println(c2.eyecolor);
	c2.sing();
	c2.play();
	System.out.println("******************************");
	Parent p1=new Parent();
	System.out.println(p1.haircolor+" "+p1.eyecolor);
	p1.sing();
	System.out.println(Parent.race);
}
}
