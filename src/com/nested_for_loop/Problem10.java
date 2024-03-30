package com.nested_for_loop;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int space=3;space>=i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				//System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
