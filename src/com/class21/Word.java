package com.class21;

public class Word {
	private String[] array(String word) {
        String[] a  = word.split(" ");
        return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Word obj=new Word();
String [] result=obj.array("hello today is sunny.");
for(String wordd:result) {
	System.out.println(wordd);
}
	}

}
