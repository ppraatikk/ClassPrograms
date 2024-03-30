package com.containment;
class Bottle{
	int price;
	String type;
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public int getPrice() 
	{
		return price;
	}
	public String getType()
	{
		return type;
	}
}

public class Bag {
	String bname;
	int price;
	String colour;
	Bottle bt;
	 
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public void  setBt(Bottle bt)
	{
		this.bt=bt;
	}
	public String getBname()
	{
		return bname;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColour()
	{
		return colour;
	}
	public Bottle getBt()
	{
		return bt;
	}

	public static void main(String[] args) {
		
		Bag b = new Bag();
		b.setBname("American Toriuster");
		b.setPrice(1234);
		b.setColour("red");
		b.setBt(new Bottle());
		
		Bottle bt = b.getBt();
		bt.setPrice(1233);
		bt.setType("leather");
		
		System.out.println(b.getBname());
		System.out.println(b.getPrice());
		System.out.println(b.getColour());
		System.out.println(bt.getPrice());
		System.out.println(bt.getType());
				
	}

}
