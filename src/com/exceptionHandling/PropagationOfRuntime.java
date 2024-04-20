package com.exceptionHandling;

public class PropagationOfRuntime {
	
	
	public static void m1()
	{
		throw new NullPointerException("This is null");
	}
	public static void n1()
	{
		m1();
	}
	public static void s1()
	{
		n1();
	}
	

	public static void main(String[] args) {
		
		
		try
		{
			s1();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace(); // Gives Error 
//			System.out.println(e);
//			System.out.println(e.getMessage());
		}

		System.out.println("In mainMethod///");
	}

}
