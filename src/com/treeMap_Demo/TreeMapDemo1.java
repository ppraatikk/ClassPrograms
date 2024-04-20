package com.treeMap_Demo;
import java.util.*;

class Descending implements Comparator<String>
{
	public int compare(String i1,String i2)
	{
		return i2.compareTo(i1);
	}
	
}
public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap<String,Float>tm=new TreeMap<>(new Descending());
		
		tm.put("Prateek",12.22f);
		tm.put("Rohan",23.12f);
		tm.put("Om",8.27f);
		tm.put("Ashok",89f);
		
		System.out.println(tm);
		
		System.out.println("//////////////////////////////////////");
		
		//Descending 
//		NavigableMap<String,Float>nm=tm.descendingMap();
//		System.out.println(nm);
		
	}

}
