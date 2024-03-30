package com.arrayDemo;

import java.util.Arrays;

public class ArrayDemo6 {
	public static void arrayOperation(int arr[],int x)
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				sum2=arr[i]*arr[i];
				sum1=arr[i-1]*arr[i-1];
			}
		}
		System.out.println(sum2-sum1);
	}
	public static void arraySecondMax(int arr[])
	{
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				temp[i]=arr[i];
				arr[i]=arr[j];
				arr[j]=temp[i];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Largers Element is "+arr[arr.length-2]);
	}
	public static void arraySecndMax(int arr[])
	{
		int max2=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max && max2<arr[i])
			{
				max2=arr[i];
			}
		}
		System.out.println(max2);
	}
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int x=4;
		ArrayDemo6.arrayOperation(arr, x);
		ArrayDemo6.arraySecondMax(arr);
		ArrayDemo6.arraySecndMax(arr);
	}

}
