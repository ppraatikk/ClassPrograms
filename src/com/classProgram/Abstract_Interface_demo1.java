package com.classProgram;

interface Horn{
	void honk();	
}
abstract class Vechile{
	abstract void start();
	abstract void stop();
}
class Car extends Vechile implements Horn{
	void start()
	{
		System.out.println("CAr Is Started");
	}
	void stop()
	{
		System.out.println("CAr is Stopped");
	}
	public void honk()
	{
		System.out.println("Car Horn is Honking");
	}
}
class Motorcycle extends Vechile implements Horn{
	void start()
	{
		System.out.println("MotorCycle is Stated");
	}
	void stop()
	{
		System.out.println("MotorCycle is Stopped");
	}
	public void honk()
	{
		System.out.println("MotorCycle horn is Honking");
	}
}
public class Abstract_Interface_demo1 {

	public static void main(String[] args) {
		
		Motorcycle m = new Motorcycle();
		m.start();
		m.stop();
		m.honk();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.honk();
	}

}
