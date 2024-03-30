package com.arrayObject_Assignment;

import java.util.Scanner;

public class CheckEmploys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employs emp []= new Employs[5];
		System.out.println("Enter Array Details");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter Employs Number");
			int empno=sc.nextInt();
			System.out.println("Enter Employs Name");
			String empname=sc.next();
			System.out.println("Enter Department id");
			int deptid=sc.nextInt();
			System.out.println("Enter Dept name");
			String deptname=sc.next();
			Department d = new Department(deptid,deptname); 
			Employs e=new Employs(empno,empname,d);
			emp[i]=e;
		}
		for(Employs x:emp)
		{
			System.out.println(x);
		}

	}

}
