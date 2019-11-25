package com.class24;

public class Main {
	
		  static int count=0;
		public   static int  met1(){
		    count++;
		    return count;
		  }
		  public static void main(String[] args) {
		   Main ob1=new Main();
		   ob1.met1();
		   System.out.println(ob1.count);
		   Main ob2=new Main();
		   ob2.met1();
		   System.out.println(ob2.count);
		   Main ob3=new Main();
		     ob3.met1();
		    
		     
		      System.out.println(ob3.count);
		  }
		}
