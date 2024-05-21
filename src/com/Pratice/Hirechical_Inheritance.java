package com.Pratice;

class Electronicss{
	public void warrenty()
	{
		System.out.println("Warrenty Of Electronics Is 1 Year");
	}
}
class Computerr extends Electronicss{
	int price=8999;
	public void price()
	{
		System.out.println("Price Of Computer is : "+price);
	}
	
}
class Refrigrator extends Electronicss{
	int price=10999;
	public void price()
	{
		System.out.println("Price Of Refrigrator is : "+price);
	}
}
public class Hirechical_Inheritance {

	public static void main(String[] args) {
		
		Refrigrator r=new Refrigrator();
		r.price();
		r.warrenty();
		
		System.out.println("///////////////////////////////");
		
		Computerr c = new Computerr();
		c.price();
		c.warrenty();

	}

}
