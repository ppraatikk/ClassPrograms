package com.labSession;
import java.util.*;
public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<String,Integer>map=new HashMap<>();
		
		ArrayList<String>a1=new ArrayList<>();
		a1.add("Blue");
		a1.add("Pink");
		a1.add("White");
		a1.add("Blue");
		a1.add("White");
		a1.add("Pink");
		a1.add("White");
		
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext())
		{
			String temp=itr.next();
			if(map.containsKey(temp))
			{
				map.put(temp,map.get(temp)+1);
			}
			else
			{
				map.put(temp,1);
			}
		}
		
		System.out.println(map);
	}

}
