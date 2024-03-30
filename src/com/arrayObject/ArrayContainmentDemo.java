package com.arrayObject;
class Address{
	int pincode;
	String state;
	String district;
	public Address(int pincode,String state,String district)
	{
		this.pincode=pincode;
		this.state=state;
		this.district=district;
	}
	public String toString()
	{
		return pincode+" "+state+" "+district;
	}
}
class Person{
	int pid;
	String pname;
	Address adr;
	public Person(int pid,String pname,Address adr)
	{
		this.pid=pid;
		this.pname=pname;
		this.adr=adr;
	}
	public String toString()
	{
		return pid+" "+pname+" "+adr;
	}
}
public class ArrayContainmentDemo {

	public static void main(String[] args) {
		Person p[]=new Person[3];
		p[0]=new Person(1,"Prnav",new Address(413512,"MH","pune"));
		p[1]=new Person(2,"Rohan",new Address(413511,"UP","Patna"));
		p[2]=new Person(3,"Yash",new Address(52341,"qw","mumbai"));
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	}

}
