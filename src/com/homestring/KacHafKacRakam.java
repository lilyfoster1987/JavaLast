package com.homestring;

public class KacHafKacRakam {
void sayac(String str) {
	
	char[] array=str.toCharArray();
	int digit=0;
	int character=0;
	int space=0;
	int other=0;
	
	for (int i = 0; i < array.length; i++) {
		if(Character.isDigit(array[i])) {
			digit+=1;
		}
		else if(Character.isLetter(array[i])) {
			character+=1;
		}else if(Character.isSpace(array[i])) {
			space+=1;
		}else {
			other+=1;
		}
	}
	System.out.println("Amaount of letter is "+character);
	System.out.println("Amaount of digit is "+digit);
	System.out.println("Amaount of space is "+space);
	System.out.println("Amaount of other char is "+other);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KacHafKacRakam word=new KacHafKacRakam();
		word.sayac("Today is Java and date is:11/12/2019.");
	}

}
