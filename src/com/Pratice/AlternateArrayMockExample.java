package com.Pratice;

import java.util.Arrays;

public class AlternateArrayMockExample {
	
	public void alternate1(int arr1[],int arr2[])
	{
			
		 int arr[] = new int[arr1.length];
		 int x=0; int y=1;
		 
		 for(int i=0;i<arr1.length;)
		 {
			arr[x]=arr1[i];
			x=x+2;
			i=i+2;
		 }
		 
		 for(int i=1;i<arr2.length;)
		 {
			arr[y]=arr2[i];
			y=y+2;
			i=i+2;
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 	 
		 
	}
	
	
	
	
	public void alternate2(int arr1[],int arr2[])
	{
		
		
		int arr[] = new int[arr1.length];
		int x = 0;
		
		for(int i = 0; i < arr.length-1; ) 
		{
            arr[x] = arr1[i];
            x++;
            
            i++;
            
            arr[x] = arr2[i];
            x++;
            
            i++;
        }
		
		System.out.println(Arrays.toString(arr));
		
	}

	
	
	public static void main(String[] args) {
		

		
		   int arr1[] = {1, 2, 3, 4, 5};
	       int arr2[] = {6, 7, 8, 9, 10};
	        
	       
	        
	      AlternateArrayMockExample call = new AlternateArrayMockExample();

	     // call.alternate1(arr1, arr2);
	      call.alternate2(arr1, arr2);
	        
		
		
		
		
		
		
		
	}

}
