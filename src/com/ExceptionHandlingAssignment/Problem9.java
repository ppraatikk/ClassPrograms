package com.ExceptionHandlingAssignment;



public class Problem9 {

	public static void main(String[] args) {
		int arr[]=null;
		String s=null;
		
		try {
			System.out.println(arr[1]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		try {
			System.out.println(s.toCharArray());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		try {
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
