package com.array_2D;

public class SumOfColoum {
	public static void SumOfColoum(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[j][i];
			}
			System.out.println(sum);
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
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		SumOfColoum.showArray(arr);
		System.out.println("//////////////////////");
		SumOfColoum.SumOfColoum(arr);
	}

}
