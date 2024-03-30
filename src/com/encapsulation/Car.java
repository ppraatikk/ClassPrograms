package com.encapsulation;

public class Car {

	public static void main(String[] args) {
		CarInfo c= new CarInfo();
		
		c.setModelno(1212);
		c.setCarname("Suzuki");
		c.setPrice(57900.25);
		c.setSpeed(79);
		
		if(c.getSpeed()<80 && c.getSpeed()!=0)
		{
		 System.out.println(c.getModelno()+" "+c.getCarname()+" "+c.getPrice()+" "+c.getSpeed());
		}
	}

}
