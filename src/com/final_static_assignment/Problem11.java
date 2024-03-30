package com.final_static_assignment;

class Mobile{
	static String sname = "X";
	String iname = "Y";
	public static void show()
	{
		Mobile m = new Mobile();
		System.out.println(sname+m.iname);
	}
	public void show1()
	{
		
		this.show();
		System.out.println(sname+iname);
	}
}
class Iphone extends Mobile{
	   static String sname = "x";
	   String iname = "y";
	  public static void display()
	  {
		  Iphone i = new Iphone();
		  System.out.println(sname+i.iname);
	  }
	  public void display1()
	  {
		  this.show();
		  super.show1();
		  this.show1();
		  this.display();
		  System.out.println(sname+iname);
	  }
	
}
public class Problem11 {

	public static void main(String[] args) {
		Iphone i = new Iphone ();
				i.display1();

	}

}
