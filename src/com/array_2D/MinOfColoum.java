package com.array_2D;

public class MinOfColoum {
	public static void minOfCol(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min =arr[0][i];
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[j][i]<min)
				{
					min=arr[j][i];
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
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		MinOfColoum.showArray(arr);
		System.out.println("////////////////////////");
		MinOfColoum.minOfCol(arr);

	}

}
