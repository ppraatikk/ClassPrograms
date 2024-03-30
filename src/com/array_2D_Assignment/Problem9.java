package com.array_2D_Assignment;

public class Problem9 {
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
	public static void sumofRow(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println("sum of Row is "+sum);
		}
	}
	public static void sumofCol(int arr[][])
	{
		    for(int j=0;j<arr.length;j++)
			{
		    	int sum=0;
		    	for(int i=0;i<arr[j].length;i++)
				{
		    		sum+=arr[i][j];
				}
		    	System.out.println("Sum Of Coloum "+sum);
			}		
	}

	public static void main(String[] args) {
		
		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Problem9.showArray(arr);
		System.out.println("//////////");
		Problem9.sumofRow(arr);
		System.out.println("//////////");
		Problem9.sumofCol(arr);
	}

}
