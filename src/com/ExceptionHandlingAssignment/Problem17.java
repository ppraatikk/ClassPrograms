package com.ExceptionHandlingAssignment;

public class Problem17 {
	
	public static void show()
	{
		String s=null;
		System.out.println(s.length());
		throw new NullPointerException("String is Empty");
	}
	public static void display() throws Exception 
	{
		System.out.println(50/0);
	}

	public static void main(String[] args) {
		
		
		try {
			show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try {
			display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
