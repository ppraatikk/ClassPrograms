package com.nested_for_loop;
// a
// a b
// a b c
// a b c d
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch ='a';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char k=(char) (ch+j);
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}

}
