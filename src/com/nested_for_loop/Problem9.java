package com.nested_for_loop;
// a b c d
// a b c
// a b
// a
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=4;i>0;i--)
		{
			char ch='a';
			for(int j=0;j<i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");
		}
	}

}
