package com.Pratice;

import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {
		
		int arr[]= {20,31,9,53,11,05,47,69,29,4,13};
		
		
		
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);

		
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		int minn=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>min && arr[i]<minn)
			{
				minn=arr[i];
			}
		}
		System.out.println(minn);
		
		
		
		int arr1[]= {2,1,11,5};
		int j=arr1.length-1;
		for(int i=0;i<arr1.length/2;i++)
		{
			int temp=arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int k=i+1;k<arr1.length;k++)
			{
				if(arr1[i]>arr1[k]) 
				{
					int temp=arr1[i];
					arr1[i]=arr1[k];
					arr1[k]=temp;
				}
			}
		}
		for(int x:arr1)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
