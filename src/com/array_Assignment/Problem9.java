package com.array_Assignment;

import java.util.Arrays;
import java.util.Scanner;
		
public class Problem9 {
	     public void even(int arr[])
	     {
	    	 int start1=0;
	    	 int start2=0;
	    	  int odd[] = new int[10];
	    	 int even[] = new int[10];
		     for(int i=0;i<arr.length;i++)
		     {
		    	 if(arr[i]%2==0)
		    	 {
		    	  even[start1]=arr[i];
		    	  start1++;
		    	 }
		    	 else
		    	 {
		    		 odd[start2]=arr[i];
		    		 start2++;
		    	 }
		     }
		     for(int i=0;i<start1;i++)
		     {
		    	 System.out.println(even[i]);
		     }
		     for(int i=0;i<start2;i++)
		     {
		    	 System.out.println(odd[i]);
		     }	   
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Element of array");
		for(int i=0;i<arr.length;i++)
		{
		 arr[i]=sc.nextInt();
		}
		Problem9 p = new Problem9();
		p.even(arr);
}

}
