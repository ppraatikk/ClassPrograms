package com.loops_assignment;
//11.Find all prime number between 400 to 300;
public class Problem11 {

	public static void main(String[] args) {
		
		for(int i=400;i>=300;i--)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
