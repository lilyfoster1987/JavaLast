package com.class20;

public class AllMethods {
	
		//create methods to return value of sum
		//sub
		//mult
		//div
		int sum(int num1, int num2) {
			int result=num1+num2;
			return result;
		}

		int sub(int num1, int num2) {
			int sub=num1-num2;
			return sub;
		}

		int div(int num1, int num2) {
			int div=num1/num2;
			return div;
		}

		int mult(int num1, int num2) {
			int mult=num1*num2;
			return mult;
		}

		int findLargest(int num1, int num2) {
			int largest;
			if (num1 > num2) {
				largest = num1;
			} else {
				largest = num2;
			}
			return largest;
		}
		//method to return whether number is odd
		boolean isOdd(int num) {
			boolean isOdd;

			if (num%2!=0) {
				isOdd=true;
			}else {
				isOdd=false;
			}
			return isOdd;
		}
		String weekDay(int day) {
			String weekDay;
			
			if(day==1) {
				weekDay="monday";
				
			}
			else if(day==2) {
				weekDay="Tueasday";
				
			}
			else if(day==3) {
				weekDay="Wednesday";
				
			}
			else if(day==4) {
				weekDay="Thursday";
				
			}
			else if(day==5) {
				weekDay="Friday";
				
			}
			else if(day==6) {
				weekDay="Saturday";
				
			}
			else {
				weekDay="Sunday";
			}
			
			return weekDay;
		}
		public static void main(String[] args) {
			AllMethods obj=new AllMethods();
			String day=obj.weekDay(3);
			System.out.println(day);
			if(day.equals("Tuesday") || day.equals("Wednesday")|| day.equals("Thursday") || day.equals("Sunday") || day.equals("Saturday")) {
				System.out.println("I am learning Java");
			
			}else {
				System.out.println("Holiday");
			}
		}
	}