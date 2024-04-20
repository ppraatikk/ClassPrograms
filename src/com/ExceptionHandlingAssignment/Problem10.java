package com.ExceptionHandlingAssignment;

public class Problem10 {

	public static void show()
	{
		throw new NullPointerException("Null");
	}
	
	public static void main(String[] args) {
		
		try {
			show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block Is Executed");
		}

	}

}
