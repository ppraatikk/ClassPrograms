package com.real_world_problem;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units");
		float unit=sc.nextFloat();
		float bill1,bill2,bill3,bill4,charges,totalbill;
		if(unit<=50)
		{
			
			bill1=0.50f*unit;
			charges=bill1*20/100;
			totalbill=bill1+charges;
			System.out.println("Electricity bill : "+totalbill);
		}
		else if(unit<=150)
		{
			
			bill2=0.50f*50+(unit-50)*0.75f;
			charges=bill2*20/100;
			totalbill=bill2+charges;
			System.out.println("Electricity bill : "+totalbill);
		}
		else if(unit<=250)
		{
			
			bill3=0.50f*50+0.75f*100+(unit-150)*1.20f;
			charges=bill3*20/100;
			totalbill=bill3+charges;
			System.out.println("Electricity bill : "+totalbill);
		}
		else 
		{
			
			bill4=0.50f*50+0.75f*100+1.20f*100+(unit-250)*1.50f;
			charges=bill4*20/100;
			totalbill=bill4+charges;
			System.out.println("Electricity bill : "+totalbill);
		}
	}

}
