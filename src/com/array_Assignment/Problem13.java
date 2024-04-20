package com.array_Assignment;

public class Problem13 {
	public static void secondMin(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		int min2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>min && arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		System.out.println(min2);
	}

	public static void main(String[] args) {
		int arr[]= {15,3,45,8,11,29,6};
		
		Problem13.secondMin(arr);
	}

}
