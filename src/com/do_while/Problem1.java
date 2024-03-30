package com.do_while;
//WA to Perform add,mul,div
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char ch;
		do
		{	
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("1:add 2:mul 3:div");
		int choice=sc.nextInt();
		switch(choice)
		      {
		           case 1:
			               System.out.println(num1+num2);
			               break;
		           case 2:System.out.println(num1*num2);
		                  break;
		           default: System.out.println("Wrong Option");     
		      }
		      System.out.println("Do you Want to continue...");
		      ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');    
	}

}
