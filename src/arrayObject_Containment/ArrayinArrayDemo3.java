package arrayObject_Containment;

import java.util.Arrays;
import java.util.Scanner;

class Product{
	int pid;
	String pname;
	double pprice;
	public Product(int pid,String pname,double pprice)
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
class OrderInfo{
	int oid;
	String oname;
	Product p[];
	public OrderInfo(int oid,String oname,Product p[])
	{
		this.oid=oid;
		this.oname=oname;
		this.p=p;
	}
	public String toString()
	{
		return oid+" "+oname+" "+Arrays.toString(p);
	}
}
public class ArrayinArrayDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderInfo o[] = new OrderInfo[2];
		System.out.println("Order Details");
		double res=0;
		//double total_price=0;
		for(int i=0;i<o.length;i++)
		{
			double total_price=0;
			System.out.println("Enter Order id");
			int oid=sc.nextInt();
			System.out.println("Enter order NAme");
			String oname=sc.next();
			System.out.println("How many prodect");
			int size =sc.nextInt();
			Product p[]=new Product[size];
			for(int j=0;j<p.length;j++)
			{
				System.out.println("Enter Product id");
				int pid =sc.nextInt();
				System.out.println("Enter Product name");
				String pname=sc.next();
				System.out.println("Enter Product Price");
				double pprice=sc.nextDouble();
				p[j]=new Product(pid,pname,pprice);
				total_price=total_price+pprice;
			}
			 res=total_price;
			System.out.println("ENter pricce Of Oder is "+total_price);
			o[i]=new OrderInfo(oid,oname,p);
		}
		for(int i=0;i<o.length;i++)
		{
			System.out.print(o[i]);
			System.out.println(" "+res);
		}
		

	}

}
