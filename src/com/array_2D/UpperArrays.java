package com.array_2D;

public class UpperArrays {
	public static void upperTriangle(int arr[][])
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
		
	public static void show(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		UpperArrays.show(arr);
		System.out.println("//////////////////////////");
		 UpperArrays.upperTriangle(arr);
	}

}
