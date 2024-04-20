package com.ArrayListDemo;
import java.util.*;
public class Array_to_ArrayList1 {

	public static void main(String[] args) {
		
		String str[]= {"Pune","Latur","Mumbai"};
		Integer arr[]= {1,2,3,4};
		
		
		ArrayList<String>a1=new ArrayList<>(Arrays.asList(str));
		System.out.println(a1);
		
		
		ArrayList<String>a2=new ArrayList<>();
		Collections.addAll(a2,str);
		System.out.println(a2);
		
		
		
		ArrayList<Integer>a3=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			a3.add(arr[i]);
		}
		System.out.println(a3);
	}

}
