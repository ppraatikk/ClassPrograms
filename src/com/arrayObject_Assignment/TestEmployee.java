package com.arrayObject_Assignment;

public class TestEmployee {

	public static void showArr(Employee earr[]) {
		for(Employee e:earr) {
			System.out.println(e);
		}
	}
	
	public static void showEmpWithSameSal(Employee earr[]) {
		int i,j,count=0;
		for(i=0;i<earr.length;i++) {
			count=0;
			for(j=0;j<earr.length;j++) {
				
				if(earr[i].getSal()==earr[j].getSal()) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(earr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emps[]=new Employee[6];
		
		emps[0]=new Employee(101, "pratik", 20000);
		emps[1]=new Employee(102, "gajanan", 25000);
		emps[2]=new Employee(103, "priyanka", 20000);
		emps[3]=new Employee(104, "shital", 15000);
		emps[4]=new Employee(105, "vaishnavi", 20000);
		emps[5]=new Employee(106, "rani", 15000);

		showArr(emps);
		System.out.println("employee with same salary");
		showEmpWithSameSal(emps);
	}

}
