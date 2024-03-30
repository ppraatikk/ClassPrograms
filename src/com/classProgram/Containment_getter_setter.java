package com.classProgram;

class Department{
	 String name;
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }
}
public class Containment_getter_setter {
		 int id;
		 String name;
		 Department dept;
		
		public void setId(int id)
		{
			this.id=id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setDept(Department dept)
		{
			this.dept=dept;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public Department getDept()
		{
			return dept;
		}

	public static void main(String[] args) {
		
		Containment_getter_setter obj = new Containment_getter_setter();
		obj.setId(199);
		obj.setName("As");
		obj.setDept(new Department());
		
		Department dept = obj.getDept();
		dept.setName("zzz");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		
		System.out.println(dept.getName());
		

	}

}
