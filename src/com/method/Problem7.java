package com.method;
//WA to print series 1,3,7,15,31,63
import java.util.Scanner;
public class Problem7 {
	
	public void numberSeries(int terms)
	{
		
		int ele=1;
		for(int i=1;i<=terms;i++)
		{
			System.out.println(ele);
			ele=ele*2+1;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int res=sc.nextInt();
		Problem7 obj = new Problem7();
		obj.numberSeries(res);
	}

}
