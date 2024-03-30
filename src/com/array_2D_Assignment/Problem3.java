package com.array_2D_Assignment;

public class Problem3 {
	public static void rowMax(int arr[][])
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
			System.out.println("Max Of Row "+max);
		}
		
	}
	public static void colMin(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[0][i];
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
			System.out.println("Min Of Coloum "+min);
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
		
		int arr[][]= {{1,2,3},{5,6,7},{8,9,11}};
		Problem3.showArray(arr);
		System.out.println("/////////////////");
		Problem3.rowMax(arr);
		System.out.println("/////////////////");
		Problem3.colMin(arr);
	}

}
