package com.TreeMap_Assignment;

import java.util.*;
import java.util.Map.Entry;
public class TreeMapMethod {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>map=new TreeMap<>();
		

		map.put(1, "Yash");
		map.put(7,"Rohan");
		map.put(12, "Pranav");
		map.put(3, "Amit");
		
		System.out.println(map);
		Entry<Integer,String>a=map.ceilingEntry(5);
		System.out.println(a);
		
		Entry<Integer,String>b=map.lowerEntry(5);
		System.out.println(b);
		
		SortedMap<Integer,String>c=map.subMap(3,true,12,true);
		System.out.println(c);
	}

}
