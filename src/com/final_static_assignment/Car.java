package com.final_static_assignment;

public class Car {
	static String model ="honda";
	static int totalCarSold=11;

	public static void main(String[] args) {
		Car.model="Activa";
		Car.totalCarSold=12;
		System.out.println(model+" "+totalCarSold);
		
		Car c1 = new Car();
		Car c2 = new Car();
		c1.model="Yamma";
		c1.totalCarSold=13;
		System.out.println(c2.model+" "+c2.totalCarSold);
	}

}
