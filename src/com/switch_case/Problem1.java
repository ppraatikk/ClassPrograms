package com.switch_case;
//WA to print day in week
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		int day = sc.nextInt();
		
		switch(day)
		{
			case 1: 
					System.out.println("Monday");
					break;
			case 2:
					System.out.println("tuesday");
					break;
			case 3:
					System.out.println("Wednesday");
					break;
			case 4:
					System.out.println("Thursday");
					break;
			case 5:
					System.out.println("Friday");
					break;
			case 6:
					System.out.println("Saturday");
					break;
			case 8:
					System.out.println("Sunday");
					break;
			default :
					System.out.println("day not exist");
			
		}

	}

}
