package com.containment_assignment;
class Departmentt{
	private int id;
	private String name;
	
	public void setId(int id)
	{
	 this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
}
public class Student {
	private int rollno;
	private String name;
	private Departmentt department;
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDepartment(Departmentt department)
	{
		this.department=department;
	}
	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	public Departmentt getDepartment()
	{
		return department;
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRollno(12);
		s.setName("CS");
		s.setDepartment(new Departmentt());
		
		Departmentt department = s.getDepartment();
		department.setId(12345);
		department.setName("AI");
		
System.out.println(s.getRollno()+" "+s.getName()+" "+department.getId()+" "+department.getname());
				}

}
