package com.ExceptionHandlingAssignment;

public class Problem19 {
	
	public static void show() throws Exception 
	{
		String s="123abc";
		int num=Integer.parseInt(s);
		
		System.out.println(num);
		
	}

	
	
	
	public static void main(String[] args) {
		
		
		try {
			show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
