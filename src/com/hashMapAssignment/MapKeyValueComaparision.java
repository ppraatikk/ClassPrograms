package com.hashMapAssignment;

import java.util.HashMap;
import java.util.Map;

public class MapKeyValueComaparision {
	//Range inclusive given range and exclusive given range
	public static void range1(HashMap<Integer,String>map)
	{
		int key1=2;
		int key2=4;
		for(Map.Entry<Integer,String>mm:map.entrySet())
		{
			
			if(mm.getKey()>=key1 && mm.getKey()<key2)
			{
				System.out.println(mm.getKey()+" "+mm.getValue());
			}
		}
	}

	
	//range between givenKeys 
	public static void range2(HashMap<Integer,String>map)
	{
		int key1=1;
		int key2=5;
		for(Map.Entry<Integer,String>mm:map.entrySet())
		{
			if(mm.getKey()>key1 && mm.getKey()<key2)
			{
				System.out.println(mm.getKey()+" "+mm.getValue());
			}
		}
	}
	
	
	public static void range3(HashMap<Integer,String>map)
	{
		int key=4;
		for(Map.Entry<Integer,String>mm:map.entrySet())
		{
			if(mm.getKey()>=key)
			{
				System.out.println(mm.getKey()+" "+mm.getValue());
			}
		}
	}
	
	public static void range4(HashMap<Integer,String>map)
	{
		int key=4;
		for(Map.Entry<Integer,String>mm:map.entrySet())
		{
			if(mm.getKey()>key)
			{
				System.out.println(mm.getKey()+" "+mm.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer,String>map = new HashMap<>();
		
		map.put(1,"Sham");
		map.put(2,"Prateek");
		map.put(3,"Rohan");
		map.put(4,"Yash");
		map.put(5,"Pranav");
		
		
		range1(map);
		System.out.println("////////////////////////");
		range2(map);
		System.out.println("////////////////////////");
		range3(map);
		System.out.println("////////////////////////");
		range4(map);
		
		
	}

}
