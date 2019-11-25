package com.homemethods;

public class Elections {
	/*Create three classes: Elections, Republican, Democratic
	Republican has some variables: voterName, nominee, totalVotes, totalContributions
	Democratic has some variables: voterName, nominee, totalVotes, totalContributions
	Both classes have a method called vote and a method called contribute which takes the amount as parameter.
	In the Elections class you create voters from each party, you set the voter name, and then you make him vote. 
	In the vote method, you print: voterName voted for nominee and also you increase the totalVotes. 
	Some of the voters may want to contribute for their party. They call the method contribute and specify 
	the amount of money they want to contribute. It will be added to the amount of totalContributions.
	At the end you should print the number of votes for each party and check who has more votes is the winner.
	Note: Nominee is the president candidate for each party.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Republican voter1=new Republican();
voter1.voterName="Zeynep";
Republican.nominee="john";
voter1.vote();
voter1.contribute(500);
Republican voter2=new Republican();
voter2.voterName="ali";
Republican.nominee="john";
voter2.vote();
voter2.contribute(600);
Republican voter3=new Republican();
voter3.voterName="Zeynep";
Republican.nominee="john";
voter3.vote();
voter3.contribute(700);

Democratic voter4=new Democratic();
voter4.voterName="hasan";
Democratic.nominee="jane";
voter4.vote();
voter4.contribute(100);
Democratic voter5=new Democratic();
voter5.voterName="mehmet";
Democratic.nominee="jane";
voter5.vote();
voter5.contribute(4500);
System.out.println("*******************************************");
System.out.println("total votes for Republican party is "+Republican.totalVotes);
System.out.println("total votes for Republican party is "+Democratic.totalVotes);
System.out.println("****************************************************");
if(Republican.totalVotes>Democratic.totalVotes) {
	System.out.println("the nominee "+Republican.nominee+" won");
}else if(Republican.totalVotes<Democratic.totalVotes) {
	System.out.println("the nominee "+Democratic.nominee+" won");
}else {
	System.out.println("the elections must be done again.");
}

	}

}
