package com.ExceptionHandlingAssignment;

import java.io.IOException;

class Game{                                      //Child Class Method Declare 
												//	only Unchecked Exception because Parent class
	                                            // method doesn't declare Exception
	void show() 
	{
		System.out.println("Pareent Class");
	}
}
class Snooker extends Game{
	
	void show() throws ArithmeticException
	{
		System.out.println("Child Class");
	}
	
//	void show() throws IOException
//	{
//		System.out.println("Child Method");
//	}
}

public class Problem16 {
	public static void main(String[] args) {
	
		Game obj = new Snooker();
	
		try {
			obj.show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
