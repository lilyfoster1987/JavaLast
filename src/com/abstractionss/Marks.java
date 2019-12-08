package com.abstractionss;
/*We have to calculate the percentage of marks obtained in three subjects
(each out of 100) by student A and in four subjects (each out of 100) by
student B. Create class 'Marks' with an abstract method 'getPercentage'.
It is inherited by classes 'A' and 'B' each having a method with the same
name which returns the percentage of the students. The constructor of student A
takes the marks in three subjects as its parameters and the marks 
in four subjects as its parameters for student B. Test your code*/
public abstract class Marks {
public abstract void getPercentage();
}
class A extends Marks{
int history;
int math;
int PE;
	public A(int history,int math,int PE) {
		this.history=history;
		this.math=math;
		this.PE=PE;
	}
	public void getPercentage() {
		System.out.println("the percentage is  "+(history+math+PE)/3);
		
	}
	
}
class B extends Marks{
	int history;
	int math;
	int PE;
	int science;
		public B(int history,int math,int PE,int science) {
			this.history=history;
			this.math=math;
			this.PE=PE;
			this.science=science;
		}
	@Override
	public void getPercentage() {
		System.out.println("the percentage is  "+(history+math+PE+science)/3);
		
	}
	
}