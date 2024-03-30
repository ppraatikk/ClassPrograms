package com.switch_case;

/*For any integer input not between 1 to 7 it should display 
"error, day does not exist"*/

import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to print day");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Monday");
			   break;
		case 2:System.out.println("Tuesday");
			   break;
		case 3:System.out.println("Wednesday");
		       break;
		case 4:System.out.println("Thursday");
		       break;
		case 5:System.out.println("Friday");
		       break;
		case 6:System.out.println("Saturday");
		       break;
		case 7:System.out.println("Sunday");
		       break;
		default:System.out.println("Error day Doesn't Exsit");       
		}
	}

}
