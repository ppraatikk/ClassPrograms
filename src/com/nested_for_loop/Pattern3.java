package com.nested_for_loop;
//4 3 2 1
//3 2 1
//2 1
//1
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4;i>=1;i--)
		{   
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
				
			}
			System.out.println("");
		}
	}

}
