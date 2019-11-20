package com.homemethods;

public class NumberOfWords {
int wordnum(String str) {
	String[] str1=str.split(" ");
	int length=str1.length;
	return length;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java method to count all words in a string. Go to the editor
		Test Data:
		Input the string: The quick brown fox jumps over the lazy dog.
		Expected Output:

		Number of words in the string: 9*/
		NumberOfWords obj=new NumberOfWords();
		int a=obj.wordnum("Today is java and i am very tried.");
		System.out.println("Number of words in the string: "+a);
	
	}

}
