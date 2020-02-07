package com.class38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Recap {
	public static void main(String[] args) {
		List<String> list1=returnStringList("zeynep","celik");
		Map<String,String> map1=returnMap("zeynep","celik","hasan","celik");
		Scanner s=returnScanner();
		System.out.println(list1);
		System.out.println(map1);
		System.out.println(s);
		
	}
public static Scanner returnScanner() {
	Scanner scan= new Scanner(System.in);
	return scan;
}
	public static List<String> returnStringList(String str,String str1){
		List<String> list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		return list;
	}
	public static Map<String,String> returnMap(String key,String value,String key1,String value1){
		Map<String,String> map=new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		return map;
	}
	


}
