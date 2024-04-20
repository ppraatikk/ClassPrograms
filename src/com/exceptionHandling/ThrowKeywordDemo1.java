package com.exceptionHandling;

public class ThrowKeywordDemo1{
	
	public static void valid(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible For Driving");
		}
		else
		{
			System.out.println("Eligible for Driving");
		}
	}

	public static void main(String[] args) {
		
		try {
		ThrowKeywordDemo1.valid(17);
		}
		catch (Exception e)
		{
			System.out.println(e);
			//System.out.println(e.getMessage());
		}

	}

}
