package com.array_Assignment;

public class Problem10 {
	public int findMax(int arr[])
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public int findMin(int arr[])
	{
		int min = arr[0];
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
		
		int arr[] = {11,22,32,42,599,19,19999,8,99,19,1999};
		
		Problem10 p = new Problem10();
		
		int max = p.findMax(arr);
		System.out.println("Maximun in Array is : "+max);
		
		int min = p.findMin(arr);
		System.out.println("Minimum In Arrays is : "+min);

	}

}
