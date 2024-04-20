package com.ExceptionHandlingAssignment;

public class Problem3 {

	public static void main(String[] args) {
		
		int a=10;
		
		try
		{
			System.out.println(a/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
