package com.ExceptionHandlingAssignment;

public class Problem1 {
	public static void show()
	{
		int arr[]= {1,2,3,5};
		
		for(int i=0;i<arr.length;i++)
		{
		  System.out.println(arr[10]);
		  throw new ArrayIndexOutOfBoundsException();
		}
	}

	public static void main(String[] args) {
		
		try {
			Problem1.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
