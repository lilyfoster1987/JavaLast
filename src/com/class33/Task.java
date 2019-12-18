package com.class33;

import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	ArrayList<String>  name=new ArrayList<>(5);
	
	name.add(0,"zeynep");
	name.add(1, "ali");
	name.add(2, "fatma");
	name.add(3, "ayse");
	name.add(4, "oya");
	System.out.println(name.isEmpty());
	System.out.println(name.contains("zeynep"));
	System.out.println(name.size());
	System.out.println(name);
	
	
}
}
