package com.class34;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance> arr=new ArrayList<>();
		arr.add(new Car("Geico","Toyota Corolla"));
		arr.add(new Pet("Geico","Dog"));
		arr.add(new Health("Seven Color"));
		
		System.out.println("******for loop*****");
for (int i = 0; i < arr.size(); i++) {
	
	arr.get(i).getQuote();
	arr.get(i).cancelInsurance();
}
System.out.println("******advanced  loop*****");
for(Insurance o:arr) {
	
	o.getQuote();
	o.cancelInsurance();
}
Iterator<Insurance> it=arr.iterator();
System.out.println("******iterator*****");
while(it.hasNext()) {
	it.next().getQuote();
	it.next().cancelInsurance();
}

	}

}
