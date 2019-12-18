package com.class37;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

class Car{
	String make,model;
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
		
	}
	public void display() {
		System.out.println(make+" "+model);
	}
	
}


public class CarTest {
	
	
	
public static void main(String[] args) {
	
	Map<Integer,Car> mapCar=new LinkedHashMap<>();
	mapCar.put(1, new Car("Toyota","Corolla"));
	mapCar.put(2, new Car("Bmw","x5"));
	mapCar.put(3, new Car("Honda","Civic"));
	mapCar.put(4, new Car("Nissan ","Rouge"));
	mapCar.put(5, new Car("Tesla","s"));
	
	//Collection<Integer,Car> val=mapCar.values();
	System.out.println(mapCar.size());
	//display only valu of object
	Collection<Car> val=mapCar.values();
	for(Car v:val) {
		v.display();
		//System.out.println(v.make+" "+v.model);
	}
	System.out.println("*****iterator***********");
	Iterator<Car> it=val.iterator();
	while(it.hasNext()) {
		it.next().display();
	}
	
	Set<Entry<Integer,Car>> set=mapCar.entrySet();
	for(Entry<Integer,Car> ent:set) {
		Car x=ent.getValue();
		x.display();
		//System.out.println(ent.getKey()+" "+ent.getValue().make+ent.getValue().model);
		
		Set<Integer> key=mapCar.keySet();
		Iterator<Integer> it1=key.iterator();
		while(it1.hasNext()) {
			Integer it2=it1.next();
			Car c2=mapCar.get(it2);
			System.out.println(it2+"=="+c2.make+" "+c2.model);
		}
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		Iterator itt = map.iterator();
		while (itt.hasNext() )
		{
		System.out.print( itt.next() + " " );
		}
	}
}
}
