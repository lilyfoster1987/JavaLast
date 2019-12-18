package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {
		LinkedList<Card> list=new LinkedList<>();
		list.add(new MasterCard("A4568785",8000.0));
		list.add(new Visa("A4568785",8000.0));
		list.add(new GoldCard("A4568785",8000.0));
		Iterator<Card> it=list.iterator();
		while(it.hasNext()) {
			Card cc=it.next();
			cc.creditLimit();
			cc.increaseLimit();
		}
	}

}
