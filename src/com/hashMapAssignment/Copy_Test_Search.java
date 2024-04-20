package com.hashMapAssignment;
import java.util.*;

public class Copy_Test_Search {
	
	
	public static void copy(HashMap<Integer,String>hm)
	{
		HashMap<Integer,String>hm1=new HashMap<>();
		hm1.putAll(hm);
		System.out.println(hm1);
	}
	
	
	
	
	
	public static void isEmpty()
	{
		HashMap<Integer,String>hm1=new HashMap<>();
		if(hm1.isEmpty())
			System.out.println("it is Empty");
		else
			System.out.println("it is not Empty");
	}
	
	
	
	
	public static void searchByKey(HashMap<Integer,String>hm)
	{
		int key =1;
		if(hm.containsKey(key))
			System.out.println("Present Key");
		else
			System.out.println("Not present Key");
	}
	
	
	
	
//	public static void searchByValues(HashMap<Integer,String>hm)
//	{
//		String value="Prateek";
//		if(hm.containsValue(value))
//			System.out.println("Present Values");
//		else
//			System.out.println("Not Present value");
//	}
	
	

	public static void testByKey(HashMap<Integer,String>hm)
	{
		int key=3;
		if(hm.containsKey(key))
			System.out.println("present "+key+" "+hm.get(key));
		else
			System.out.println("Not Present Key");
	}
	
	
	
	
	public static void testByValues(HashMap<Integer,String>hm)
	{
		String value="gaju";
		if(hm.containsValue(value))
			System.out.println("Present "+value+" ");
		else
			System.out.println("Not present Value");
	}
	

	
	public static void main(String[] args) {
		
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1,"Prateek");
		hm.put(2,"gaju");
		hm.put(3,"Sham");
		
		copy(hm);
		isEmpty();
		searchByKey(hm);
//		searchByValues(hm);
		testByKey(hm);
	    testByValues(hm);
		
	}

}
