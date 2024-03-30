package com.encapsulation;

public class StudentInfo {
	private int id;
	private String name;
	private double marks;
	private boolean place;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	public void setPlace(boolean place)
	{
		this.place=place;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getMarks()
	{
		return marks;
	}
	public boolean getPlace()
	{
		return place;
	}

}
