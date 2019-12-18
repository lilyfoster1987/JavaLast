package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of even numbers from 1 to 50. Using
//Iterator remove any number that is divisible by 5 from that arrayList.

public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> even=new ArrayList<>();
		for(int i=0; i<50; i++) {
			if(i%2==0) {
				even.add(i);
				
			}		
		}
		System.out.println(even);
		Iterator<Integer> it =even.iterator();
		//first way
		while(it.hasNext()) {
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(even);
		//second way
		
		for (int i = 0; i < even.size(); i++) {
			if(even.get(i)%5==0 ) {
				even.remove(i);
			}
		}
		System.out.println(even);
	}


}
