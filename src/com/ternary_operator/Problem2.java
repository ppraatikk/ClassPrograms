package com.ternary_operator;
//WA to check Maximum number From Two Number

import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		int ans=(num1>num2)? num1:num2;
		System.out.println(ans);
	}

}
