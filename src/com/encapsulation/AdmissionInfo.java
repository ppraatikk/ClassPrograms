package com.encapsulation;

public class AdmissionInfo {
	private int id;
	private String name;
	private int marks;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public void setMarks(int marks)
	{ 
		if(marks>=60)
		{
			this.marks=marks;
		}
		else
		{
			System.out.println("Student is not Eiligble for admission");
		}
		
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getMarks()
	{
		return marks;
	}
	

}
