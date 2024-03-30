package com.encapsulation;

public class CarInfo {
	private int modelno;
	private String carname;
	private double price;
	private int speed;
	
	public void setModelno(int modelno)
	{
		this.modelno=modelno;
	}
	public void setCarname(String carname)
	{
		this.carname=carname;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setSpeed(int speed)
	{
		if(speed>=80)
		{
		 System.out.println("Speed is OverLIMit ....Please contRol Speed");		
		}
		else
		{
			this.speed=speed;		
			
		}
		
	}
	public int getModelno()
	{
		return modelno;
	}
	public String getCarname()
	{
		return carname;
	}
	public double getPrice()
	{
		return price;
	}
	public int getSpeed()
	{
	   return speed;		
    }


}
