package com.array_2D_Assignment;

import java.util.Scanner;
	
public class Problem1 {
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
		Scanner sc = new Scanner(System.in);
		int arr[][]= new int[3][4];
		System.out.println("ENter Element Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
				
		Problem1.showArray(arr);

	}

}
