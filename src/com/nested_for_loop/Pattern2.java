package com.nested_for_loop;
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			int k=1;
			for(int j=i;j<=4;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println("");
		}
	}

}
