package com.ternary_operator;
//WA to check even or odd
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		String msg=(num%2==0)?"Even":"Odd";
		System.out.println(msg);
	}

}
