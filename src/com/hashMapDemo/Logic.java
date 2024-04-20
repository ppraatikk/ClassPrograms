package com.hashMapDemo;
import java.util.*;
class Employee{
	int eid;
	String ename;
	double esalary;
	String ecity;
	public Employee(int eid, String ename, double esalary, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.ecity = ecity;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", ecity=" + ecity + "]";
	}
}
public class Logic {

	public static void main(String[] args) {
		
		ArrayList<Employee>list=new ArrayList<>();
		
		list.add(new Employee(1,"A",4500,"Pune"));
		list.add(new Employee(2,"B",4500,"Mumbai"));
		list.add(new Employee(3,"C",4500,"Pune"));
		list.add(new Employee(4,"D",4500,"Nashik"));
		list.add(new Employee(5,"E",4500,"Nagpur"));
		list.add(new Employee(6,"F",4500,"Pune"));
		list.add(new Employee(7,"G",4500,"Mumbai"));
		list.add(new Employee(8,"H",4500,"Surat"));
		list.add(new Employee(9,"I",4500,"Latur"));
		list.add(new Employee(10,"j",4500,"Lucknow"));
		
		HashMap<String,ArrayList<String>>map=new HashMap<>();
		
		
		for(Employee e:list)
		{
			ArrayList<String>a1;
			if(map.containsKey(e.ecity))
			{
				a1=map.get(e.ecity);
				a1.add(e.ename);
			}
			else
			{
				a1=new ArrayList<>();
				a1.add(e.ename);
			}
			map.put(e.ecity,a1);
		}
		
		
		for(Map.Entry<String,ArrayList<String>>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
