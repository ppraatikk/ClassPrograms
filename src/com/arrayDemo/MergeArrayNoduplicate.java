package com.arrayDemo;

import java.util.Arrays;

public class MergeArrayNoduplicate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,2};
		int b[]= {1,2,3,4,5,6,1};
		int c[]= new int[a.length+b.length]; 
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
				else {
					c[i]=a[i];
				}
			}	
		}
		System.out.println(Arrays.toString(c));
	}

}
