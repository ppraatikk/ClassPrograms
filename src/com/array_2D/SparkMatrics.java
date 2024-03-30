package com.array_2D;

public class SparkMatrics {
	public static void findSparkMatrics(int arr[][])
	{
		int count1=0; int count2=0;
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
			System.out.println("Spark Matrix");
		else
			System.out.println("NOT Spark MAtrix");
	}

	public static void main(String[] args) {
	
		int arr[][] = {{1,0,0},{0,2,0},{0,0,3}};
		SparkMatrics.findSparkMatrics(arr);
	}

}
