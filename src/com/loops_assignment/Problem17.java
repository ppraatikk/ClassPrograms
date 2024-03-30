package com.loops_assignment;
// Disarum no 135=1+3*3+5*5*5=135

public class Problem17 {

	public static void main(String[] args) {
		int num=135; int digit=0;
		int count=0;
		
		for(int i=num;i>0;)
		{
			i=i/10;
			count++;
		}
		
		for(int i=num;i>0;)
		{
			digit=i%10;
			
		}
	}

}
