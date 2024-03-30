package arrayObject_Containment;

import java.util.Arrays;
import java.util.Scanner;

class Student{
	int id;
	String name;
	int marks[];
	public Student(int id,String name,int marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}
}
public class ArrayinArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[3];
		System.out.println("Enter Studdent Details");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Student Id");
			int id =sc.nextInt();
			System.out.println("Enter Student Name");
			String name=sc.next();
			System.out.println("Enter No of Marks");
			int size=sc.nextInt();
			int marks[]=new int[size];
			for(int j=0;j<marks.length;j++)
			{
				marks[j]=sc.nextInt();
			}
			Student ss = new Student(id,name,marks);
			s[i]=ss;
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);	
		}
	}

}
