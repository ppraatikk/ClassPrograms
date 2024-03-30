package com.containment;
class Engine{
	String type; 
	
	public Engine(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return type;
	}
}
class Gear{
	String type;
	
	public Gear(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return type;
	}
}
public class Car {
	int carmodelno;
	String carname;
	Engine eng;
	Gear gr;
	
	public Car(int carmodelno,String carname,Engine eng,Gear gr)
	{
		this.carmodelno=carmodelno;
		this.carname=carname;
		this.eng=eng;
		this.gr=gr;
	}
	public String toString()
	{
		return carmodelno+" "+carname+" "+eng+" "+gr;
	}

	public static void main(String[] args) {
		//Engine e= new Engine("Petrol");
		//Gear g= new Gear("Manual");
		Car c= new Car(12,"BMW",new Engine("Petrol"),new Gear("manual"));
		System.out.println(c);
	}

}
