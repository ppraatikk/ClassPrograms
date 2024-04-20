package com.hashMapAssignment;
import java.util.*;
class Run{
	int run;

	public Run(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Sport [run=" + run + "]";
	}
	
}
class Name{
	String name;

	public Name(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}	
}
public class CustomHashMap9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Name,Run>map=new HashMap<>();
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter Player Name");
			String name=sc.next();
			System.out.println("Enter Player Run");
			int run=sc.nextInt();
			map.put(new Name(name),new Run(run));
		}
		
		Set s=map.entrySet();
		Iterator<Map.Entry<Name,Run>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Name,Run>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
				
		
	}

}
