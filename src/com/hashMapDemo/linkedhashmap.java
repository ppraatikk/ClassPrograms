package com.hashMapDemo;

import java.util.*;
class Car{
	int modelNo;
	String colour;
	double price;
	public Car(int modelNo, String colour, double price) {
		super();
		this.modelNo = modelNo;
		this.colour = colour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", colour=" + colour + ", price=" + price + "]";
	}
	@Override
	public int hashCode()
	{
		return modelNo;
	}
	@Override
	public boolean equals(Object o)
	{
		Car c=(Car)o;
		if(this.modelNo==c.modelNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

public class linkedhashmap {

	public static void main(String[] args) {

		LinkedHashMap<Car,Integer>map=new LinkedHashMap<>();
		map.put(new Car(101,"Pink",3.5),10);
		map.put(new Car(102,"Red",4.5),20);
		map.put(new Car(103,"Yellow",1.5),25);
		
		

		
		for(Map.Entry<Car,Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println("/////////////////////////////");
		map.put(new Car(101,"White",8.5),40);
		
		for(Map.Entry<Car,Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
	
	

}
