package com.class22;

public class Forest {
	public static void main(String[] args) {
		Wolf w1=new Wolf();
		w1.color="Black";
		w1.age=2;
		w1.numberOfWolves=1;
		w1.displayInfo();
		
		Wolf w2=new Wolf();
		w2.color="white";
		w2.age=3;
		w2.numberOfWolves=2;
		w2.displayInfo();
		Wolf w3=new Wolf();
		w3.color="red";
		w3.age=9;
		w3.numberOfWolves=3;
		w3.displayInfo();
		
		Bear b1=new Bear();
		b1.type="Polar bear";
		b1.weight=89;
		b1.numberOfBears=1;
		b1.displayInfo();
		Bear b2=new Bear();
		b2.type="Brown";
		b2.weight=75;
		b2.numberOfBears=2;
		b2.displayInfo();
		
		Fox f1=new Fox();
		f1.color="black";
		f1.speed=100;
		f1.numberOfFoxes=1;
		f1.displayInfo();
		
		Fox f2=new Fox();
		f2.color="Brown";
		f2.speed=150;
		f2.numberOfFoxes=2;
		f2.displayInfo();
		
		System.out.println("there are "+Wolf.numberOfWolves+" wolf in the forest");
		
		System.out.println("there are "+Fox.numberOfFoxes+" fox in the forest");
		System.out.println("there are "+Bear.numberOfBears+" bear in the forest");
		
	}

}
