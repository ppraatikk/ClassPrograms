package com.exceptionHandling;

public class Finally {

	public static void main(String[] args) {
		
		try
		{
			String s="Latur";
			System.out.println(s.length());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("Main////");
	}

}
