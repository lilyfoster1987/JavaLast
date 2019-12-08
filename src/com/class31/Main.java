package com.class31;
import java.util.Scanner;
class Main {
        public static void main(String[] args){
            Main obj=new Main();
            obj.method();
        }
public final void method(){
         Scanner scan1=new Scanner(System.in);
         int a=scan1.nextInt();
         Scanner scan2=new Scanner(System.in);
         int b=scan2.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("a is now assigned value of "+a);
         System.out.println("b is now assigned value of "+b);
}
}