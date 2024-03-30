package com.array_2D_Assignment;

public class Problem5 {
	public static void outerElement(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1 )
				{
					System.out.print(arr[i][j]+" ");
				}
					
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
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Problem5.showArray(arr);
		System.out.println("/////////////////");
		Problem5.outerElement(arr);
	}

}
