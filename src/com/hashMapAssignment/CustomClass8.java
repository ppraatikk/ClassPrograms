package com.hashMapAssignment;
import java.util.*;

class Employee{
	int id;
	public Employee(int id)
	{
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
}
public class CustomClass8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<Employee,String>map=new HashMap<>();
		for(int i=1;i<=4;i++)
		{
			System.out.println("ENter Employee details");
			System.out.println("Enter Id and Name");
			map.put(new Employee(sc.nextInt()),sc.next());
		}
		
		System.out.println(map);

	}

}
