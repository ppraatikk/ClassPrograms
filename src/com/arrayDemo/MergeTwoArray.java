package com.arrayDemo;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {2,3,5,6,7,1};
		int arr[] = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
				arr[arr1.length+i]=arr2[i];			
		}
		System.out.println(Arrays.toString(arr));
	}

}
