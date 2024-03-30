package com.switch_case;
//WA to print add,sub,mul,div
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter Choice");
		String str=sc.next();
		
		switch(str)
		{
			case "Addition":
							System.out.println(num1+num2);
							break;
			case "Substraction":
							System.out.println(num1-num2);
							break;
			case "Multiplication":
							System.out.println(num1*num2);
							break;
			case "Division":
				  			System.out.println(num1/num2);
				  			break;
			default : 
							System.out.println("Sorry");
		}
	}

}
