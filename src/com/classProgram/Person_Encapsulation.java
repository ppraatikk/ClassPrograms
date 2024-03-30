package com.classProgram;

public class Person_Encapsulation {
	private int accno;
	private String name;
	private double balence;
	
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalence(double balence)
	{
		this.balence=balence;
	}
	
	public int getAccno()
	{
		return accno;
	}
	public String getName()
	{
		return name;
	}
	public double getBalence(int withdraw)
	{
		if(withdraw<=1500)
		{
			return balence=balence-withdraw;
		}
		else 
		{
			return balence;
		}
	}
	
	


	

}
