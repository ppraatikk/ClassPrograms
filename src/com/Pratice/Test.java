package com.Pratice;
import java.util.*;




class Dept{
	int did;
	String dname;
	
	Dept(int did,String dname)
	{
	  this.did=did;
	  this.dname=dname;
	}
	
	public String toString()
	{
	 return did+" "+dname;
	}

}
class Employ implements Comparable<Employ>{
  
	int eid;
        String ename;
        int esalary;
	Dept d;	  
	
	Employ(int eid,String ename,int esalary,Dept d)
	{
	 this.eid=eid;
	 this.ename=ename;
	 this.esalary=esalary;
	 this.d=d;
	} 
	
	public String toString()
	{
	  return eid+" "+ename+" "+esalary+" "+d;
	}
	
	
	public int hashCode()
	{
	 return eid;
	}
	
	public boolean equals(Object o)
	{
	 Employ e = (Employ) o;
	 if(this.eid==e.eid)
	    {	
		return true;
	     }
	  else{
		return false;
	     }	
	 
	} 

	
	public int compareTo(Employ e)
	{
		if(this.d.dname.equals(e.d.dname))
		{
			
		}
	  return e.d.dname.compareTo(this.d.dname);
	  
	}
	

	

}



 public  class Test{
    	public static void main(String[] args){


	TreeMap<Employ,String>map=new TreeMap<>();
	
	Employ e = new Employ(1,"Rajesh",75000,new Dept(101,"HR"));	
	Employ e1 = new Employ(2,"Yash",25000,new Dept(102,"Admission"));	
	Employ e2 = new Employ(3,"Pranav",76000,new Dept(103,"Finance"));	
	Employ e3 = new Employ(4,"Amit",54000,new Dept(104,"Sales"));	
	
	map.put(e,"Nashik");
	map.put(e1,"Pune");
	map.put(e2,"Mumbai");
	map.put(e3,"Latur");

     System.out.println(map);
   }
	
}