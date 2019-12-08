package com.class30;

public abstract class Parent{
	 
	  public abstract void method1();
	  public void method2(){
	    System.out.println("Normal method2 implementation in parent class" );
	  }
	    
	  
	}
 class Main extends Parent {
	  
	  
public  void method1(){
  
   System.out.println("Abstract method1 implementation in parent class" );
}
  public void method2(){
    System.out.println("Normal method2 implementation in parent class" );
  }
  public static void main(String[] args){
    Parent obj=new Main();
    obj.method1();
    obj.method2();
    
  }
}