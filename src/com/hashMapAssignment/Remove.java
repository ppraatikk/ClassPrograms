package com.hashMapAssignment;
import java.util.*;
public class Remove {
	
	public static void remove(HashMap<Integer,String>hm)
	{
		int key =1;
		if(hm.containsKey(key))
		{
			hm.remove(key);
		}
		
		for(Map.Entry<Integer,String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

	public static void main(String[] args) {

		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1,"SS");
		hm.put(2,"RPS");
		hm.put(3,"PTS");
		
		remove(hm);

	}

}
