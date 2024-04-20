package com.labSession;
import java.util.*;

class Movies{
	int mid;
	String mname;
	double mprice;
	public Movies(int mid, String mname, double mprice) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	@Override
	public int hashCode()
	{
		return mid;
	}
	@Override
	public boolean equals(Object o)
	{
		Movies m=(Movies)o;
		if(this.mid==m.mid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class hashCodeAndEqualsDemo {

	public static void main(String[] args) {
		
		HashMap<Movies,Integer>map=new HashMap<>();
		
		map.put(new Movies(101,"RRR",80.50),13);
		map.put(new Movies(102,"Maidan",112.59),07);
		map.put(new Movies(103,"Crew",105.30),12);
		map.put(new Movies(104,"Animal",65.05),3);
		map.put(new Movies(105,"Sanju",95.90),1);
		
		System.out.println(map);
		System.out.println("///////////////////////////////////");
		map.put(new Movies(104,"Animal",65.05),5);
		System.out.println(map);
		
	}

}
