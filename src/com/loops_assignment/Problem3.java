package com.loops_assignment;
//3.WAP to print even numbers from 121 to 229 using do-while loop. 
public class Problem3 {

	public static void main(String[] args) {
		
		int i=121;
		do 
		{	
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=229);
	}

}
