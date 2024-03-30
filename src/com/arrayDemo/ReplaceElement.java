package com.arrayDemo;

import java.util.Arrays;

public class ReplaceElement {
	public static int[] replaceElement(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				arr[i]=1;
			}
		}
		return arr;	
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] ans = ReplaceElement.replaceElement(arr);
		System.out.println(Arrays.toString(ans));

	}

}
