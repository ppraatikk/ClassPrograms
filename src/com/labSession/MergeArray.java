package com.labSession;

import java.util.Arrays;

public class MergeArray {
	
	public static void mergeArray(int a[],int b[])
	{
		
		
		int res[]=new int[a.length+b.length];
		int x=0;
		int maxlength=Math.max(a.length,b.length);
		
		for(int i=0;i<maxlength;i++)
		{
			if(i<a.length)
			{
				res[x]=a[i];
				x++;	
			}
			if(i<b.length)
			{
				res[x]=b[i];
				x++;
			}
			
		}
		System.out.println(Arrays.toString(res));
	}
	
	public static void merge(int c[],int d[])
	{
		int res[]=new int[c.length+d.length];
		int maxlength=Math.max(c.length,d.length);
		int x=0;
		for(int i=0;i<maxlength;i++)
		{
			if(i<c.length)
			{
				res[x]=c[i];
				x++;
			}
			i++;
			if(i<d.length)
			{
				res[x]=d[i];
				x++;
			}
		}
		for(int i=0;i<x;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.print("\n");
	}
	public static void seprateEvenOdd(int arr[])
	{
		int x=0;
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				res[x]=arr[i];
				x++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				res[x]=arr[i];
				x++;
			}	
	   }
		System.out.println(Arrays.toString(res));
	}
	public static void seprate(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]%2!=0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}	
	public static void negativePositive(int arr1[])
	{
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>0)
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
		
	public static void LeftShift(int arr[])
	{
		int firstDigit=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=firstDigit;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {10,20,30,40,50,60};
		
		int c[]= {1,2,3,4,5,6};
		int d[]= {10,20,30,40,50};
		
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= {1,-2,-3,4,5,-6};
		
		
	   
		MergeArray.mergeArray(a,b);
		MergeArray.merge(c,d);
		
	    MergeArray.seprateEvenOdd(arr);	
	    MergeArray.seprate(arr);
	    MergeArray.negativePositive(arr1);
	    
	    MergeArray.LeftShift(arr);
	  
	    
	}

}
