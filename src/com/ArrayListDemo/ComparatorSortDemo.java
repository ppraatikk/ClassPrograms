package com.ArrayListDemo;
import java.util.*;

class Train{
	int id;
	String name;
	int seats;
	public Train(int id, String name, int seats) {
		this.id = id;
		this.name = name;
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", seats=" + seats + "]";
	}
	
}
class NameCompartor implements Comparator<Train>{
	public int compare(Train t1,Train t2)
	{
		if(t1.seats==t2.seats)
		{
			return t1.name.compareTo(t2.name);
		}
	    else
		{
			return t1.seats-t2.seats;
		}
		
	  
	}
}
public class ComparatorSortDemo {

	public static void main(String[] args) {
		
		LinkedList<Train>list=new LinkedList<>();
		list.add(new Train(101,"PuneExpress",60));
		list.add(new Train(102,"MumbaiExpress",90));
		list.add(new Train(103,"DelhiExpress",90));
		list.add(new Train(104,"RajDhaniExpress",150));
		

		System.out.println(list);
		System.out.println("/////////////////////////////////////");
		
		Collections.sort(list,new NameCompartor());
		System.out.println(list);
		
		
		
	}

}
