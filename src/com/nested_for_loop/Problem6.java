package com.nested_for_loop;
//  1 1 1 1
//  1 1 1
//  1 1
//  1
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println("");
		}
	}

}
