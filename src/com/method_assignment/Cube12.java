package com.method_assignment;
//12)write a java program to calculate cube for given number using no return type ,with return type,
//with parameter passing, with parameter and return type

public class Cube12 {
	
		public void cube1()
		{
			int num=3;
			System.out.println("Cube : "+num*num*num);
		}
		public int cube2()
		{
			int num=4;
			int cube=num*num*num;
			return cube;
		}
		public void cube3(int num)
		{
			System.out.println("Cube : "+num*num*num);
		}
		public int cube4(int num)
		{
			int cube=num*num*num;
			return cube;
		}
	
	public static void main(String[] args) {
		Cube12 c=new Cube12();
        c.cube1();
        int x=c.cube2();
        System.out.println("Cube : "+x);
        c.cube3(5);
        int y=c.cube4(6);
        System.out.println("Cube : "+y);
	}

}


