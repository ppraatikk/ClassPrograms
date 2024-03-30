package com.classProgram;
// Can it is Possible to Overload the Overridden Method
class Fan{
	void move(int speed)
	{
		System.out.println(" p Fan is Moving "+speed);
	}
	
}
class TableFan extends Fan{
	@Override
	void move(int speed)
	{
		System.out.println("c TableFan is Moving "+speed);
	}
	void move(float size)
	{
		System.out.println("c TableFan is size "+size);
	}
	
}



public class Overriden {

	public static void main(String[] args) {
		
		TableFan t = new TableFan();
		t.move(2.3f);
		t.move(20);
	}

}
