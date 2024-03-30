package com.superkey_thiskey_assignment;

public class Cycle {
	int accno;
	int noofwheel;
	public Cycle()
	{
		System.out.println("I am Default Constructor");
	}
	public Cycle(int accno,int noofwheel)
	{
		this();
		System.out.println("I am Another Constructor");
	}

	public static void main(String[] args) {
		
		Cycle c = new Cycle(); // O/P is I am Default Constructor
		
		Cycle cy = new Cycle(12,49); //  O/P is I a, default constructor
									  //        i am another Constructor 
	}

}
