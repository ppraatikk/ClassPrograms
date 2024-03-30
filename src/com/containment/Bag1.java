package com.containment;
class Nib{
	String ntype;
	int nprice;
	
	public void setNtype(String ntype)
	{
		this.ntype=ntype;
	}
	public void setNprice(int nprice)
	{
		this.nprice=nprice;
	}
	public String getNtype()
	{
		return ntype;
	}
	public int getNprice()
	{
		return nprice;
	}
}
class Pen {
	String pname;
	int pprice;
	String pcolour;
	Nib nib;
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public void setPprice(int pprice)
	{
		this.pprice=pprice;
	}
	public void setPcolour(String pcolour)
	{
		this.pcolour=pcolour;
	}
	public void setNib(Nib nib)
	{
		this.nib=nib;
	}
	public String getPname()
	{
		return pname;
	}
	public int getPprice()
	{
		return pprice;
	}
	public String getPcolour()
	{
		return pcolour;
	}
	public Nib getNib() 
	{
		return nib;
	}
}
public class Bag1 {
	String bname;
	int price;
	Pen pen;
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setPen(Pen pen)
	{
		this.pen=pen;
	}
	public String getBname()
	{
		return bname;
	}
	public int getPrice()
	{
		return price;
	}
	public Pen getPen()
	{
		return pen;
	}

	public static void main(String[] args) {
		 
		Bag1 bg = new Bag1();
		bg.setBname("Addidas");
		bg.setPrice(1212);
		bg.setPen(new Pen());
		
		Pen pen = bg.getPen();
		pen.setPname("Reynolds");
		pen.setPprice(10);
		pen.setPcolour("red");
		pen.setNib(new Nib());
		
		Nib nib = pen.getNib();
		nib.setNtype("Plastic");
		nib.setNprice(100);
			
		System.out.println(bg.getBname());
		System.out.println(bg.getPrice());
		
		System.out.println(pen.getPname());
		System.out.println(pen.getPprice());
		System.out.println(pen.getPcolour());
		
		System.out.println(nib.getNtype());
		System.out.println(nib.getNprice());
	}

}
