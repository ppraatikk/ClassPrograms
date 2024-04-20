package com.ExceptionHandlingAssignment;

public class Problem18 {
	final int x=10;
	
	public static void show() throws Exception
	{
		Problem18 obj = new Problem18();
		System.out.println(obj.x/0);
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
			System.out.println("Finally Block");
		}
		

	}

}
