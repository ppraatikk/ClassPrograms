package com.final_static_assignment;

class Vehical{
	void show()
	{
		System.out.println("Vehical is running");
		
	}
}
class Bikee extends Vehical{
	@Override
	void show()
	{
		System.out.println("Bike is Running");
	}
	
}

public class Problem5 {

	public static void main(String[] args) {
		
		Bikee b = new Bikee();
		b.show();	
		Vehical v = new Vehical();
		v.show();
		Vehical vh = new Bikee();
		vh.show();
	}

}
