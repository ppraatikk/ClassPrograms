package com.array_2D_Assignment;

public class Problem11 {
	public static void avg(int arr[][])
	{
		double sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0 || i==arr.length-1 || j==0 || j==arr[i].length-1)
				{
					continue;
				}
				else
				{
					sum+=arr[i][j];
					count++;
				}
			}
		}
		
		double avg = (double)sum/count;
		System.out.println("average is "+avg);
		
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
		Problem11.showArray(arr);
		System.out.println("///////////////");
		Problem11.avg(arr);
	}

}
