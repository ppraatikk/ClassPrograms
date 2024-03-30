package com.array_2D;

import java.util.Arrays;

public class AdditionOfArray {
	public static void add(int arr1[][],int arr2[][])
	{
		int arr[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
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
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,3},{7,8,9},{10,11,12}};
		
		AdditionOfArray.add(arr1, arr2);
	}

}
