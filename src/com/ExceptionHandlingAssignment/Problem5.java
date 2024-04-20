package com.ExceptionHandlingAssignment;

public class Problem5 {

	public static void main(String[] args) {

		int arr[]= {1,2,3};
		
		try {
			System.out.println(arr[4]);
		}
		finally
		{
			System.out.println("Finally");
		}

	}

}
