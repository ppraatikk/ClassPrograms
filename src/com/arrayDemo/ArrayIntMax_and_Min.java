package com.arrayDemo;

public class ArrayIntMax_and_Min {
	public int max(int arr[])
	{
		int max =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max; 
	}
	public int min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,8,0,3,4,5,6,7,1,2,3,4,5};
		ArrayIntMax_and_Min p = new ArrayIntMax_and_Min();
		
		
		int min=p.min(arr);
		int max=p.max(arr);
		System.out.println("Max oF Array : "+max);
		System.out.println("Min oF Array : "+min);

	}

}
