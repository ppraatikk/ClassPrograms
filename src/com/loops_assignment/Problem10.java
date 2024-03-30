package com.loops_assignment;
//10.Write a Java program to find frequency of each digit in a given integer.

public class Problem10 {

	public static void main(String[] args) {
		int count=0;
		int digit=0;
		
		int num=11234445;
		for(int i=num;i>0;)
		{
			digit=i%10;
			for(int j=num;j>0;)
			{
				j=j/10;
				if(digit==j)
				{
					count++;
				}
			}
			System.out.println("Digits :"+digit+" "+"Frequency :"+count);	
			i=i/10;
		}
	}

}
