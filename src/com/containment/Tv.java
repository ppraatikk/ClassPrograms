package com.containment;
class Distributor{
	String name;
	int price;
	public Distributor(String name ,int price)
	{
		this.name=name;
		this.price=price;
	}
	public void showDistributor()
	{
		System.out.println(name+" "+price+" ");
	}
}
class Brand{
	String name;
	int price;
	Distributor dist;
	 public Brand(String name,int price,Distributor dist)
	 {
		 this.name=name;
		 this.price=price;
		 this.dist=dist;
	 }
	 public void showBrand()
	 {
		 System.out.println(name+" "+price+" ");
		 dist.showDistributor();
		 
	 }
}
public class Tv {
	String name;
	int price ;
	Brand br;
	public Tv(String name,int price ,Brand br)
	{
		this.name=name;
		this.price=price;
		this.br=br;
	}
	public void showTv()
	{
		System.out.println(name+" "+price+" ");
		br.showBrand();
	}

	public static void main(String[] args) {
		Distributor d = new Distributor("IPhone",12500);
		Brand b = new Brand("IFB",11000,d);
		 Tv tv = new Tv ("SAmsung",12000,b);
		 tv.showTv();
	}

}
