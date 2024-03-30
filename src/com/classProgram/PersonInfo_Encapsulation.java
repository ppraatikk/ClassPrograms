package com.classProgram;

import java.util.Scanner;

public class PersonInfo_Encapsulation {

	public static void main(String[] args) {
		
		Person_Encapsulation p = new Person_Encapsulation();
		p.setAccno(123456);
		p.setName("QWERT");
		p.setBalence(2100);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw");
		int amount =sc.nextInt();
		System.out.println("Acc0unt Details");
		System.out.println(p.getAccno()+" "+p.getName()+" "+p.getBalence(amount)+" ");
		

	}

}
