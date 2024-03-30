package com.forloop;
//WA to print series code 1,3,7,15,31....
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int ele=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(ele);
			ele=ele*2+1;
		}
		
	}

}
