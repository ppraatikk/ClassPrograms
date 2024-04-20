package com.ExceptionHandlingAssignment;

public class Problem11 {

	public static int show()
	{
		try {
			System.out.println("Try Block");
			return 1;	
		}
		finally 
		{
			System.out.println("Finally Block");
			 return 0;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(show());
		
	}

}
