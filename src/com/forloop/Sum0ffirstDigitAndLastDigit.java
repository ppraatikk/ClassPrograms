package com.forloop;



import java.util.Scanner;
public class Sum0ffirstDigitAndLastDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int rev=0;
		int digit=0;
		int firstDigit=num%10;
		for(int i=num;i!=0;)
		{
			digit=i%10;
			rev=(rev*10)+digit;
			i=i/10;
		}
		int lastDigit=rev%10;
		System.out.println(firstDigit+lastDigit);
	}

}
