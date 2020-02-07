package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Den1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr= {"zeynep","ali","hasan","mehmet",5,6};
ArrayList  list=new ArrayList();
for(Object s:arr) {
	list.add(s);
}
System.out.println(list);

	List<Object> list1=Arrays.asList(arr);
	System.out.println(list1);
	TreeSet<Object> set=new TreeSet<>();
	set.addAll(list1);
	
System.out.println(set);
	


	}

}
