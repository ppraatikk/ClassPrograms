package com.Pratice;

import java.util.Arrays;

public class Problem12 {

	public static void main(String[] args) {
		int arr[]= {9,3,7,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				   if(i<arr.length/2 && j<arr.length/2)
				   {
					    if(arr[i]>arr[j])
					    {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					    }
				   }
				   if(i>arr.length/2 && j>arr.length/2)
				   {
					     if(arr[i]<arr[j])
					     {
					    	 int temp=arr[i];
					    	 arr[i]=arr[j];
					    	 arr[j]=temp;
					     }
				   }
				   
				   
				   
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
