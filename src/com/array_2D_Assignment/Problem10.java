package com.array_2D_Assignment;

public class Problem10 {
	public static void sumOfDiagonal(int arr[][])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		  for(int j=0;j<arr[i].length;j++)
		  {
			  if(i==j)
			  {
				  sum+=arr[i][j];
			  }
		  }
		}
		System.out.println("Sum Of Diagonal "+sum);
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
		Problem10.showArray(arr);
		System.out.println("////////////////////");
		Problem10.sumOfDiagonal(arr);
	}

}
