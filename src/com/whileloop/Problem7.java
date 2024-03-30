package com.whileloop;
//WA to print fibonacci series
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number series");
		int num=sc.nextInt();
		int fno=0;
		int sno=1;
		int tno=0;
		int i=3;
		
		System.out.println(fno);
		System.out.println(sno);
		
		while(i<=num)
		{
			
			tno=fno+sno;
			fno=sno;
			sno=tno;
			System.out.println(tno);
			i++;
		}
	}

}
