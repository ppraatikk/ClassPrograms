package com.ExceptionHandlingAssignment;

public class Problem12 {
	public static int show()
	{
		try {
			return 10;
		}
		finally {
			return 20;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(show());

	}

}
