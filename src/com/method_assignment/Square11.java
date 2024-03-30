package com.method_assignment;
//11)write a java program to calculate square for given number using no return type ,with return type,
//with parameter passing, with parameter and return type.

public class Square11 {
		int num;
		
		public void sqr(int x)
		{
			num=x*x;
			System.out.println("Square : "+num);
		}
		public int sqrr(int x)
		{
			num=x*x;
			return num;
		}
		public void sqrrr()
		{
			int num=2;
			System.out.println("Square : "+num*num);
		}
		

		public static void main(String[] args) {
			Square11 s=new Square11();
			s.sqr(5);
			int num=s.sqrr(3);
			System.out.println("Square : "+num);
			s.sqrrr();

		}

	


	}


