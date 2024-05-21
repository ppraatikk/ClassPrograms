package com.Pratice;

public class BankAccount {
	private int accno;
	private double balence;
	
	public void setAccno(int accno)
	{
		this.accno=accno;
	}
	public void setBalence(double balence)
	{
		this.balence=balence;
	}
	public int getAccno()
	{
		return accno;
	}
	public double getBalence()
	{
		return balence;
	}
	
	public void deposit(double amount)
	{
		balence+=amount;
		System.out.println("Account Bal : "+balence);
	}
	public void withdraw(double amount)
	{
		if(balence>=amount)
		{
			balence=balence-amount;
			System.out.println("Account Bal : "+balence);
		}
		else
		{
			System.out.println("Insufficient Balence to Withdraw");
		}
	}
	

}
