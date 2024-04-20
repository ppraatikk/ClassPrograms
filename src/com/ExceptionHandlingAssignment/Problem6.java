package com.ExceptionHandlingAssignment;

public class Problem6 {
	
	public static void show()
	{
		int arr[]= {1,2,3};
		try
		{
			System.out.println(arr[4]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void show1()
	{
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void show2()
	{
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void show3()
	{
		try {
			int arr[]=new int[-5];
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		
			Problem6.show();
			Problem6.show1();
			Problem6.show2();
			Problem6.show3();
	
		
	}

}
