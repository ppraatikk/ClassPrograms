package com.classProgram;

public class Program1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("TQ PUNE "+i);
			}
			else if(i%3==0)
			{
				System.out.println("TQ "+i);
			}
			else if(i%5==0)
			{
				System.out.println("PUNE "+i);
			}
			
		}

	}

}
