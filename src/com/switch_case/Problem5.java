package com.switch_case;
//Write a Java program print total number of days in a month using switch case 

import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month");
		String month=sc.next();
		switch(month)
		{
		case "Jan": System.out.println("Janauary is 31 days");
				    break;
		case "feb": System.out.println("feb is 28 or 29 days");
					break;
		case "March": System.out.println("March is 31 days");
					break;
		case "April": System.out.println("April is 30 days");
					break;
		case "May": System.out.println("May is 31 days");
					break;
		case "June": System.out.println("June is 31 days");
					break;
		case "July": System.out.println("July is 30 days");
					break;
		case "Aug": System.out.println("Aug is 31 days");
					break;
		case "Sept": System.out.println("Sept is 30 days");
					break;
		case "Oct": System.out.println("Oct is 31 days");
					break;
		case "Nov": System.out.println("Nov is 30 days");
					break;
		case "Dec": System.out.println("Dec is 31 days");
					break;
		}
	}

}
