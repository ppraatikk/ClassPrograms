package com.array_2D_Assignment;

public class Problem7 {
	public static void rowsToCol(int arr[][])
	{
		int temp[][]=new int [arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[j][i]=arr[i][j];
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
		  for(int j=0;j<temp[i].length;j++)
		  {
			  System.out.print(temp[i][j]+" ");
		  }
		  System.out.println();
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
		int arr[][]= { {1,2,3},{5,6,7},{8,9,11} };
		Problem7.showArray(arr);
		System.out.println("///////////////////");
		Problem7.rowsToCol(arr);

	}

}
