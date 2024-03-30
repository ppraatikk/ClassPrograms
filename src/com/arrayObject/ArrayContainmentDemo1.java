package com.arrayObject;

import java.util.Scanner;

class Product{
	int pid;
	String pname;
	double pprice;
	Product(int pid,String pname,double pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	}
	public String toString()
	{
		return pid+" "+pname+" "+pprice;
	}
}
class Order{
	int oid;
	String cityname;
	Product product;
	Order(int oid,String cityname,Product product)
	{
		this.oid=oid;
		this.cityname=cityname;
		this.product=product;
	}
	public String toString()
	{
		return oid+" "+cityname+" "+product;
	}
}
public class ArrayContainmentDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order o[]=new Order[3];
		System.out.println("Enter Array details");
		for(int i=0;i<o.length;i++)
		{
			System.out.println("ENter Order id");
			int oid =sc.nextInt();
			System.out.println("Enter Cityname");
			String cityname=sc.next();
			System.out.println("Enter Product id");
			int pid=sc.nextInt();
			System.out.println("Enter Product name");
			String pname=sc.next();
			System.out.println("Enter Product price");
			double pprice=sc.nextDouble();
			
//			Order oo = new Order(oid,cityname,new Product(pid,pname,pprice));
//			o[i]=oo;
			o[i]=new Order(oid,cityname,new Product(pid,pname,pprice));
			
		}
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
		
	}

}
