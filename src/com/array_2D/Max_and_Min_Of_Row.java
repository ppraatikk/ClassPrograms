package com.array_2D;

public class Max_and_Min_Of_Row {
	public static void max(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int max=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
	public static void min(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i][0];
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
			System.out.println(min);
		}
	}
	public static void showArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		Max_and_Min_Of_Row.showArray(arr);
		System.out.println("//////////////////////");
		Max_and_Min_Of_Row.max(arr);
		System.out.println("//////////////////////");
		Max_and_Min_Of_Row.min(arr);
	}

}
