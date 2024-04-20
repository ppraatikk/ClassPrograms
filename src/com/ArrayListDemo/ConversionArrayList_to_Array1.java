package com.ArrayListDemo;
import java.util.*;
public class ConversionArrayList_to_Array1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(19);
		a1.add(15);
		a1.add(97);
		a1.add(47);
		a1.add(21);
		
		Object arr[]=a1.toArray();
		for(Object o:arr)
		{
			System.out.println(o);
		}
		System.out.println("/////////////////////////////");
		Integer ar[]=a1.toArray(new Integer[a1.size()]);
		for(Integer i:ar)
		{
			System.out.println(i);
		}
		
		
	}

}
