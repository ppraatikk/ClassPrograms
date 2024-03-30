package com.nested_for_loop;

//WA to print prime number 1 to 25

import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter last number to print prime no");
		int num=sc.nextInt();
		
		 for(int i=1;i<=num;i++)
		 {
		       int count=0;
		       for(int j=1;j<=i;j++)
		       {
			      if(i%j==0)
			       count++;  
		       } 
	           if(count==2)
		       System.out.println(i);	 
				 
		}	
	}
}
