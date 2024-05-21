package com.Pratice;

import java.util.Arrays;

public class Problem13 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		int lastElement = arr[arr.length-1] ;
		
		
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=lastElement;
		System.out.println(Arrays.toString(arr));
		
		

	}

}
