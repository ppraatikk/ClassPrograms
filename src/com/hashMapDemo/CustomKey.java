package com.hashMapDemo;
import java.util.*;
class Product{
	int pid;
	String pname;
	double pprice;
	public Product(int pid, String pname, double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	@Override
	public int hashCode()
	{
		return(int) pprice;
	}
	@Override
	public boolean equals(Object o)
	{
		Product p=(Product)o;
		if(this.pname==p.pname && this.pprice==p.pprice)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class CustomKey {

	public static void main(String[] args) {
		
		HashMap<Product,Integer>map=new HashMap<>();
		map.put(new Product(1,"Fan",1000),35);
		map.put(new Product(2,"AC",1500),45);
		map.put(new Product(3,"Refrigrator",2000),55);
		map.put(new Product(4,"TV",2500),20);
		
		
		for(Map.Entry<Product,Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("///////////////////////////////////////");
		
		map.put(new Product(5,"AC",1500),79);
		
		for(Map.Entry<Product,Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
