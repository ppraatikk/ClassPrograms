package com.ExceptionHandlingAssignment;

public class Problem2 {
	

	public static void main(String[] args) {
		
		System.out.println("Hellooo");
		
		int arr[]= {1,2,3};
	    try {
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		System.out.println(arr[4]);
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	//e.printStackTrace();
	    }
	    
	    System.out.println("in main method");
	
	}

}
