package com.Pratice;

abstract class Bikee{
	abstract void run();
	void gear()
	{
		System.out.println("GEar ");
	}
}
class Honda extends Bikee{
	@Override
	  void run()
	{
		System.out.println("Bike is Running");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		
		Bikee b=new Honda();
		b.run();
		b.gear();

	}

}
