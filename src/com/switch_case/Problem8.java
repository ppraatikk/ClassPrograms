package com.switch_case;
//Java program to create Simple Calculator using switch case Menu Driven 
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Operation Name");
		String operation=sc.next();
		
		switch(operation)
		{
		case"Addition":System.out.println(num1+num2);
					   break;
		case"Substraction":System.out.println(num1-num2);
						break;
		case"Multiplication":System.out.println(num1*num2);
						break;
		case"Division":System.out.println(num1/num2);
						break;
		default:System.out.println("Try Again");				
		}
		
	}

}
