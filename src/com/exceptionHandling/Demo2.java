package com.exceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
		
		
		try
		{
			int a[]= {2,3,4,5};
			System.out.println(a[9]/0);
		}
		catch (NullPointerException e)
		{
			System.out.println("Nulll");
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Helloo");
	}

}
