package com.ExceptionHandlingAssignment;

public class Problem8 {
	public static void show()
	{
		int arr[]= new int[5]; String s="Hello";
		
		try {
			 arr[6]=99;
		}		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		try {
			System.out.println(s.charAt(11));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		Problem8.show();

	}

}
