package com.ExceptionHandlingAssignment;

public class Problem7 {
	public static void show()
	{
		try {
			System.out.println(1/0);
		}
		catch(Exception e)
		{
//			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		

		Problem7.show();
	}

}
