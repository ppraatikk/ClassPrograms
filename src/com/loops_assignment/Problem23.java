package com.loops_assignment;
//23.You have hundred items (1,2,3,…100) the price of each item is the same as its number..
// i.e., item 1 is of 1 rs. Item 2 is of 2 rs. And so on

public class Problem23 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0;i<=100;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
