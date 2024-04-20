package com.ArrayListDemo;
import java.util.*;

public class ConversionArrayList_to_Array2 {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<>();
		
		Integer arr[]=new Integer[a1.size()];
		
		for(int i=0;i<a1.size();i++)
		{
			arr[i]=a1.get(i);
		}
		
		for(Integer i:arr)
		{
			System.out.println(i);
		}
	}

}
