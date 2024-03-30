package com.loops_assignment;
//check no is palimdrome or not
public class Problem18 {

	public static void main(String[] args) {
		int num=105;  int digit=0;
		int rev=0;
		
		for(int i=num;i>0;)
		{
			digit=i%10;
			rev=(rev*10)+digit;
			i=i/10;
		}
		
		if(num==rev)
			System.out.println("Number is Pallindrome");
		else
			System.out.println("Number is not Pallindrome");
		
		

	}

}
