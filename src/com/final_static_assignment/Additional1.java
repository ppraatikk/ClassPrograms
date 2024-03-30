package com.final_static_assignment;
import java.util.*;

public class Additional1 {
		double dollar(double num)
		{
			return num/69.2;
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rupees");
		double num = sc.nextDouble();
		
		Additional1 a = new Additional1(); 
		double dollar = a.dollar(num);
		System.out.println("Rupees "+dollar);
		}

}
