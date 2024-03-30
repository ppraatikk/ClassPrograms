package com.switch_case;
//to check whether a number is even or odd using switch case 
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int result=num%2;
		switch(result)
		{
		case 0: System.out.println("Number is even");
				break;
		case 1: System.out.println("Number is odd");
				break;
		}
	}

}
