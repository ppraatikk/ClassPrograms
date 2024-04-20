package com.array_Assignment;

import java.util.Arrays;

public class Problem16 {
	public static int[] ascending(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {15,3,45,8,11,29,6};
		int a[]=Problem16.ascending(arr);
		System.out.println(Arrays.toString(a));
	}

}
