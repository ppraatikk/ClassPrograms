package com.whileloop;
//WA to print series 1,3,7,15,31
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int ele=1;
		int i=1;
		while(i<=num)
		{
			System.out.println(ele);
			ele=ele*2+1;
			i++;
		}
	}

}
