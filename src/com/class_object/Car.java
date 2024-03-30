package com.class_object;

public class Car {
	
	String modelno;
	String carname;
	int carprice;
	String carcolour;
	
	public static void main(String[] args) {
		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		c1.modelno="AZ2345";
		c1.carname="Swift";
		c1.carprice=120000;
		c1.carcolour="Red";
		
		c2.modelno="AZ4567";
		c2.carname="Creta";
		c2.carprice=130000;
		c2.carcolour="White";
		
		c3.modelno="AZ1234";
		c3.carname="Hyryder";
		c3.carprice=150000;
		c3.carcolour="Black";
		
		System.out.println(c1.modelno+" "+c1.carname+" "+c1.carprice+" "+c1.carcolour);
		System.out.println(c2.modelno+" "+c2.carname+" "+c2.carprice+" "+c2.carcolour);
		System.out.println(c3.modelno+" "+c3.carname+" "+c3.carprice+" "+c3.carcolour);

	}

}
