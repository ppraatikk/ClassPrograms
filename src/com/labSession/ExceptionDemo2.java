package com.labSession;



public class ExceptionDemo2 {
	
	public static void show() throws ArrayIndexOutOfBoundsException,NullPointerException
	{
		int arr[]= {1,2,3,4};
		System.out.println(arr[5]);
		String s=null;
		System.out.println(s.charAt(0));
	}
	
	

	public static void main(String[] args) {
		
		
		try {
			show();	
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e);
		}
		
	}

}
