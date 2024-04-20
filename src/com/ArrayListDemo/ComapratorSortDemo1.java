package com.ArrayListDemo;
import java.util.*;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}
class IdComparator implements Comparator<Product>{
	public int compare(Product p1,Product p2)
	{
		return p1.id-p2.id;
	}	
}
class NameComparator implements Comparator<Product>{
	public int compare(Product p1,Product p2)
	{
		return p1.name.compareTo(p2.name);
	}
}
class PriceComparator implements Comparator<Product>{
	public int compare(Product p1,Product p2)
	{
		if(p1.price==p2.price)
		{
			return p1.name.compareTo(p2.name);
		}
		else
		{
			return (int)(p1.price-p2.price);
		}
	}
}


public class ComapratorSortDemo1 {

	public static void main(String[] args) {
		LinkedList<Product>list=new LinkedList<>();
		list.add(new Product(101,"fan",60));
		list.add(new Product(102,"AC",90));
		list.add(new Product(103,"REfrigrator",90));
		list.add(new Product(104,"Tv",150));
		
		System.out.println(list);
		System.out.println("/////////////////////////////////////////");
		
		Collections.sort(list,new PriceComparator());
		System.out.println(list);
//		
//		Collections.sort(list,new NameComparator());
//		System.out.println();
//		
//		Collections.sort(list,new IdComparator());
//		System.out.println();
	

	}

}
