package com.real_world_problem;

import java.util.Scanner;
public class Problem1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Units");
		float unit=sc.nextFloat();
		float bill;
		float totalbill;
		if(unit<=50)
		{
			bill=(float) ((0.50*unit));
			totalbill=(bill*20/100);
			System.out.println(totalbill+bill);
		}
		else if(unit>=51 && unit<=150 )
		{
			bill=(float) ((0.75*unit));
			totalbill=(bill*20/100);
			System.out.println(totalbill+bill);
		}
		else if(unit>=151 && unit<=250)
		{
			bill=(float) ((1.20*unit));
			totalbill=(bill*20/100);
			System.out.println(totalbill+bill);
		}
		else
		{
			bill=(float) ((1.50*unit));
			totalbill=(bill*20/100);
			System.out.println(totalbill+bill);
		}
		
	}
}
