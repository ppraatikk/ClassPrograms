package com.constructor_assignment;

public class Account {

	long accno;
	String custname;
	
	public Account(long accno,String custname)
	{
		this.accno=accno;
		this.custname=custname;
		display();
	}
	public Account()
	{
		this.accno=123456;
		this.custname="A D RaJA";
		display();
	}
	
	
	public void display()
	{
	  System.out.println("Acc No        : "+accno);
	  System.out.println("Customer Name : "+custname);
	  System.out.println("-------**-----------**-------**--------");
	}
	public static void main(String[] args) {
		
		Account a1 = new Account(123455,"S S Deshmukh");
		Account a2 = new Account();
		Account a3 = new Account(123232,"S R Waghmare");
		Account a4 = new Account(563463,"A S Patil");
	}
}	