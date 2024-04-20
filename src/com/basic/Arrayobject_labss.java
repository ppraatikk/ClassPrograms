package com.basic;
import java.util.Scanner;
import java.util.Arrays;

class Movie
{
	int id;
	String name;
	double rating;
	Movie(int id,String name,double rating)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
	}
	public String toString()
	{
		return id+" "+name+" "+rating;
	}
}
class Theater{
	int id;
	String name;
	String location;
	Movie m[];
	Theater(int id,String name,String location,Movie m[])
	{
		this.id=id;
		this.name=name;
		this.location=location;
		this.m=m;
	}
	public String toString()
	{
		return id+" "+name+" "+location+" "+Arrays.toString(m);
	}
	
}

public class Arrayobject_labss {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Theater th[] = new Theater[1];
		Movie m[] = null;
		for(int i=0;i<th.length;i++)
		{
		
			System.out.println("Enter Theater id");
			int id=sc.nextInt();
			System.out.println("ENter Theater name");
			String name=sc.next();
			System.out.println("Enter Theater Location");
			String location=sc.next();
			//Movie m[] = new Movie[2];
		    m= new Movie[2];
			System.out.println("Enter Movie details");
			for(int j=0;j<m.length;j++)
			{
			    System.out.println("Enter Movie id");
			    int mid=sc.nextInt();
			    System.out.println("Enter Movie name");
			    String mname=sc.next();
			    System.out.println("Enter Movie Rating");
			    double mrating=sc.nextDouble();
			    Movie mm=new Movie(mid,mname,mrating);
			    m[j]=mm;
			}
			
			th[i]= new Theater(id,name,location,m);
			
		}	
		
		for(int i=0;i<th.length;i++)
		{
			System.out.println(th[i]);
		}
		System.out.println("///////////////");
	
			for(int i=0;i<th.length;i++)
			{
				for(int j=i+1;j<m.length;j++)
				{
					if(m[i].rating<m[j].rating)
					{
					     double temp=m[i].rating;
						m[i].rating=m[j].rating;
						m[j].rating=temp;
						
						String name=m[i].name;
						m[i].name=m[j].name;
						m[j].name=name;
						
						int num=m[i].id;
						m[i].id=m[j].id;
						m[j].id=num;
						
					}
				}
				
					
			
				
				System.out.println(th[i]);
		}

			
		
	}

}
