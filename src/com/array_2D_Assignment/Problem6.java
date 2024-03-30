package com.array_2D_Assignment;

public class Problem6 {
	public static void checkSparse(int arr[][])
	{
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==0)
				{
					count1++;
				}
				else 
				{
					count2++;
				}
			}
		}
		if(count1>count2)
			System.out.println("Matrix is Sparse");
		else
			System.out.println("NOt Sparse Matrix");
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
		int arr[][]= {{1,0,0},{0,2,0},{0,0,3}};
		Problem6.showArray(arr);
		System.out.println("///////////////////");
		Problem6.checkSparse(arr);

	}

}
