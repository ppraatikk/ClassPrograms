package com.ExceptionHandlingAssignment;

public class Problem14 {
	
	public static void show() throws ArithmeticException
	{
		System.out.println("Method throws Exception");
	}
	public static void display() //throws ArithmeticException
	{
		show();
	}

	public static void main(String[] args) {
		
		try {
			display();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
