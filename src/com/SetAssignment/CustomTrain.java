package com.SetAssignment;
import java.util.*;

class Train implements Comparable<Train>{
	int id;
	String name;
	int seats;
	public Train(int id, String name, int seats) {
		super();
		this.id = id;
		this.name = name;
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", seats=" + seats + "]";
	}
	@Override
	public int compareTo(Train t)
	{
		return t.seats-this.seats;
	}
	
}
public class CustomTrain {

	public static void main(String[] args) {
		TreeSet<Train>ts=new TreeSet<>();
		
		ts.add(new Train(1421,"Rajdhani Exp",70));
		ts.add(new Train(900,"Shatabdi Exp",56));
		ts.add(new Train(2314,"VandeBharat Exp",120));
		ts.add(new Train(14541,"Cst Exp",1279));
		ts.add(new Train(15041,"Mumabi meal Exp",99));
		
		
		
		System.out.println(ts);
	}

}
