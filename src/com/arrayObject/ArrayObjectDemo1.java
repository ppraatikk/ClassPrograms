package com.arrayObject;

import java.util.Arrays;
import java.util.Scanner;

class Movie{
	int mid;
	String mname;
	double cost;
	String dname;
	
	public Movie(int mid,String mname,double cost,String dname)
	{
		this.mid=mid;
		this.mname=mname;
		this.cost=cost;
		this.dname=dname;
	}
	public String toString()
	{
		return mid+" "+mname+" "+cost+" "+dname;
	}
}
public class ArrayObjectDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m[] = new Movie[3];
		System.out.println("Enter Array");
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Enter Movie id");
			int mid=sc.nextInt();
			System.out.println("Enter Movie name");
			String mname=sc.next();
			System.out.println("Enter Cost");
			int cost=sc.nextInt();
			System.out.println("Enter Director name");
			String dname=sc.next();
			
//			Movie mm = new Movie(mid,mname,cost,dname);
//			m[i]=mm;
			m[i]=new Movie(mid,mname,cost,dname); 
		}
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
		for(Movie x:m)
		{
			System.out.println(x);
		}
		System.out.println(Arrays.toString(m));
	}

}
