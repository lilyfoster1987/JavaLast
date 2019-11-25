package com.homemethods;

public class Democratic {
	//Democratic has some variables: voterName, nominee, totalVotes, totalContributions
	String voterName;
	static String nominee;
	static int totalVotes;
	static int totalContributions;
	public void vote() {
		totalVotes++;
		System.out.println(voterName+" voted to "+nominee+" in democratic party ");
		}
	public void contribute(int amount) {
		totalContributions+=amount;
		System.out.println("$"+totalContributions+" is contributed for the nominee "+nominee+" in Democratic party and total contiributions is "+totalContributions);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
