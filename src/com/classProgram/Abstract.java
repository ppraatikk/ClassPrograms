package com.classProgram;

abstract class MotorBike{
	int speed;
	MotorBike(int speed)
	{
		this.speed=speed;
		System.out.println("Motor Bike Constructor "+speed);
	}
	abstract void breake();
	void show()
	{
		System.out.println("non abstract method");
	}
}
class SportBike extends MotorBike{
	
	SportBike(int speed) {
		super(speed);
	}

	 void breake()
	{
		System.out.println("Sport Break "+speed);
	}
}
class MountainBike extends MotorBike{
	MountainBike(int speed) {
		super(speed);
	}

	 void breake()
	{
		System.out.println("Mountain break "+speed);
	}
}

public class Abstract {

	public static void main(String[] args) {
		
		MotorBike b= new SportBike(99);
		b.breake();
		b.show();
		
		MotorBike c = new MountainBike(199);
		c.breake();
		c.show();
	}

}
