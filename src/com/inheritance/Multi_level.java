package com.inheritance;
class ElectronicGadget{
	String warrenty;
}
class Electronic extends ElectronicGadget{
	String catogery;
}
class Hp extends Electronic{
	int modelno;
	int price;
	
	void insert()
	{
		modelno=111123;
		price=45000;
		catogery="Electronic";
		warrenty= "1year";
	}
	void display()
	{
		System.out.println(modelno+" "+price+" "+catogery+" "+warrenty);
	}
}
public class Multi_level {

	public static void main(String[] args) {
		
		Hp h = new Hp ();
		h.insert();
		h.display();
	}

}
