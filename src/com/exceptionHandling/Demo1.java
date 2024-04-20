package com.exceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Hiii");
		int x=10;
		
		try
		{
			int ans=x/0;
			System.out.println(ans);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
		System.out.println("In main");
		
		
	}

}
