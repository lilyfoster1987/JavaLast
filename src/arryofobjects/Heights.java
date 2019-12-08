package arryofobjects;

import java.util.Scanner;

/*Write a program to calculate the average height of all the students of a class. 
The number of students and their heights in a class are entered by user.*/
public class Heights {
	 int number;
	public void avarege() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of students");
		int number=scan.nextInt();
		int sum=0;
		for(int i=0; i<number; i++) {
			System.out.println("enter the height of students");
			int height=scan.nextInt();
			sum=sum+height;
		}


		System.out.println("avarage is "+sum/number);
	}
	/*public void row() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of students");
		this.number=scan.nextInt();
	}
	public void column() {
		for(int i=0; i<this.number; i++) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the height of students");
		int height=scan.nextInt();}
	}*/
	public static void main(String[] args) {
		Heights s1=new Heights();
		s1.avarege();
		
	}
}
