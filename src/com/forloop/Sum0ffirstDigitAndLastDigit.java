package com.forloop;



import java.util.Scanner;
public class Sum0ffirstDigitAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=num;i!=0;)
		{
		sum+=i%10;
		i=i/10;
		
		}
		System.out.println(sum);
	}

}
