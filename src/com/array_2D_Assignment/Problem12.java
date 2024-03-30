package com.array_2D_Assignment;

public class Problem12 {
	public static void upperTrangleMatrix(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int space=0;space<i;space++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	public static void lowerTrangleMatrixSum(int arr[][])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				sum+=arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum is :"+sum);
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
		Problem12.showArray(arr);
		System.out.println("////////////////////////");
		System.out.println("Upper Triangle Matrix");
		Problem12.upperTrangleMatrix(arr);
		System.out.println("Sum Of Lower Triangle Matrixx");
		Problem12.lowerTrangleMatrixSum(arr);
	}

}
