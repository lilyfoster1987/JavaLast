package com.class20;

public class Task {

	String mail(String name, String lastName, String emailType)
	{
	String email=name+lastName+"@"+emailType+".com";
	return email;	
	}
String IsPrime(int a) {
		String num;
		int sayac=0;
		for(int b=2; b<a; b++) {
			if(a%b==0)
			{
				sayac++;
			break;
			}
			
			
		}
		if(sayac==0) {num=a +" is prime number";
		
		

		}
		else{
			num="it is not prime number";
		}
		return num;
	}


	char getGrade(int score) {
		char grade;
		if(score>90) {
			
			grade='A';
			
		}
		else if(score>80 && score<90) {
			grade='B';
			
		}
		else if(score>70 && score<80) {
			grade='C';
			
		}
		else if(score>50 && score<70) {
			grade='D';
			
		}else {
			grade='F';
		}
		
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task obj=new Task();
String email1=obj.mail("zeynep", "celik", "gmail");
System.out.println(email1);
String num1=obj.IsPrime(88);
System.out.println(num1);
char grade=obj.getGrade(85);
System.out.println(grade);
	}

}
