package com.ExceptionHandlingAssignment;

import java.io.IOException;

public class Problem15 {
	
	public static void show() throws IOException
	{
		System.out.println("method thoews Exception");
	}
	public static void display() throws IOException
	{
		show();
	}

	public static void main(String[] args) {
		
    try {
    	display();
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
	}

}
