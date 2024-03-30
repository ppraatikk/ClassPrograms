package com.loops_assignment;
//20. Write a program that takes the quantity of milk and oil as input from user. .
//Milk is 40 rs. per liter and oil is 50 rs. per liter. 
//Take the input from user till the total exceeds 500. If total exceeds 500 
//display the quantity of milk and oil entered

import java.util.Scanner;
public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);  int milk1=0; int oil1=0;  
		
		while(true)
		{
			System.out.println("Enter Milk quantity in liters Rate is (40)");
			int milk =sc.nextInt();
			System.out.println("Enter Oil Quantity in liters RAte id (50)");
			int oil=sc.nextInt();
			
			  milk1=milk1+milk;
			   oil1=oil1+oil;		
			
			int total1= (40*milk1);
			int total2= (50*oil1);
			if(total1<500 || total2<500)
			{
				continue;
			}
			if(total1>=500 || total2>=500)
			{
				System.out.println("quantity of milk : "+milk1);
				System.out.println("Quantity of oil : "+oil1);
				break;
			}
		}
	}

}
