package com.exceptionHandling;

public class ThrowKeywordDemo2 {
	
	
	public static void check(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("Not Eligible For Driving");
			}
			else
			{
				System.out.println("Eligible For Driving");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		
		ThrowKeywordDemo2.check(17);
	}

}
